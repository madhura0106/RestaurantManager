package com.example.jarvis.pro10;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by it on 4/15/2017.
 */

public class Feedback extends AppCompatActivity {


    EditText fname;
    EditText pno;
    EditText emailValidate;
    EditText ftext;
    String str;
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);

        Button b1 = (Button) findViewById(R.id.fsubmit);
        try
        {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailValidate = (EditText) findViewById(R.id.fmail);

                fname = (EditText) findViewById(R.id.fname);
                ftext = (EditText) findViewById(R.id.ftext);
                final TextView textView = (TextView) findViewById(R.id.text);

                email = emailValidate.getText().toString().trim();

                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                pno = (EditText) findViewById(R.id.fphone);
                String no = pno.getText().toString();
                String snm;
                snm = fname.getText().toString();

                String spno;
                spno = pno.getText().toString();

                String semail;
                semail = emailValidate.getText().toString();

                String stext;
                stext = ftext.getText().toString();
                str = "Name:" + fname.getText().toString() + "Phone No:" + no + "email:" + email + "Feedback:" + ftext.getText().toString();
// onClick of button perform this simplest code.
                if(!snm.matches("")&&!spno.matches("")&&!semail.matches("")&&!stext.matches("")) {
                    if (email.matches(emailPattern) && isValidPhoneNumber(no)) {
                        Toast.makeText(getApplicationContext(), "You have successfully submitted feedback ", Toast.LENGTH_SHORT).show();
                        AlertDialog.Builder ad = new AlertDialog.Builder(Feedback.this);
                        ad.setTitle("Feedback:");
                        ad.setMessage(str);
                        ad.setPositiveButton("Send", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                if (isConnected())
                                    placeOrder(str);
                                else
                                    Snackbar.make(findViewById(R.id.main_content), "Please check the data connection !", Snackbar.LENGTH_LONG).show();
                            }
                        });
                        ad.show();

                    } else if (!email.matches(emailPattern) && !isValidPhoneNumber(no)) {
                        AlertDialog.Builder ad1 = new AlertDialog.Builder(Feedback.this);
                        ad1.setTitle("Invalid");
                        ad1.setMessage("Please enter the valid email address and phone:");
                        ad1.show();
                       // Toast.makeText(getApplicationContext(), "Invalid email address and phone no", Toast.LENGTH_SHORT).show();
                    } else if (!email.matches(emailPattern)) {
                        AlertDialog.Builder ad2 = new AlertDialog.Builder(Feedback.this);
                        ad2.setTitle("Invalid");
                        ad2.setMessage("Please enter the valid email address:");
                        ad2.show();
                       // Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
                    } else if (!isValidPhoneNumber(no)) {
                        AlertDialog.Builder ad3 = new AlertDialog.Builder(Feedback.this);
                        ad3.setTitle("Invalid");
                        ad3.setMessage("Please enter the valid phone no");
                        ad3.show();
                        //Toast.makeText(getApplicationContext(), "Invalid number", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    AlertDialog.Builder ad4 = new AlertDialog.Builder(Feedback.this);
                    ad4.setTitle("Sorry !!");
                    ad4.setMessage("Please enter all the fields");
                    ad4.show();
                    //Toast.makeText(getApplicationContext(), "Please enter all the fields.", Toast.LENGTH_SHORT).show();
                }

//                if (isValidPhoneNumber(no)) {
//                    //Toast.makeText(getApplicationContext(), "You have successfully submitted feedback ", Toast.LENGTH_SHORT).show();
//
//                } else {
//                    Toast.makeText(getApplicationContext(), "Invalid number", Toast.LENGTH_SHORT).show();
//                }




            }
        });
    }catch(Exception e){}




    }
    public final static boolean isValidPhoneNumber(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            if (target.length() < 6 || target.length() > 13) {
                return false;
            } else {
                return android.util.Patterns.PHONE.matcher(target).matches();
            }
        }
    }
    private void placeOrder(final String str){
        try {
            final Activity act = this;
            final ProgressDialog pd = new ProgressDialog(act);
            pd.setCancelable(true);
            pd.setMessage("In Progress...");
            pd.show();
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            final DatabaseReference myRef = database.getReference();
            myRef.child("orderNo").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    final int no = Integer.parseInt(dataSnapshot.getValue().toString());
                    myRef.child("orderNo").setValue((no + 1)).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                myRef.child("Feedback").child("" + no).setValue(str).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        pd.dismiss();
                                        Toast.makeText(getApplicationContext(), "Thank you for your valuable feedback !", Toast.LENGTH_LONG).show();
                                        act.finish();
                                    }
                                });
                            } else {
                                pd.dismiss();
                                Toast.makeText(getApplicationContext(), "Failed !", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                }
            });
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
    public static boolean isConnected() {
        boolean res=false;
        try {
            String command = "ping -c 1 google.com";
            res = Runtime.getRuntime().exec(command).waitFor() == 0;
        }catch(Exception e){}
        return res;
    }

}
