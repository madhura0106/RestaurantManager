package com.example.jarvis.pro10;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static com.example.jarvis.pro10.Feedback.isValidPhoneNumber;

public class bday extends AppCompatActivity {

     EditText nm;
    EditText no;
    Button date;
    String str;
    Button submit;
    String sdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



            super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bday);

        try {
            submit = (Button) findViewById(R.id.bsubmit);
        }catch (Exception e){}
        nm = (EditText) findViewById(R.id.bname);
        no = (EditText) findViewById(R.id.bno);


sdate="";
        try
        {
            date = (Button) findViewById(R.id.bdate);

        }catch(Exception e){}
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new BdayDate();

                newFragment.show(getSupportFragmentManager(), "datePicker");
            }
        });


        try {
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String sno2;
                    String snm2;
                    //String sdate2;


                    sno2=no.getText().toString();
                    snm2=nm.getText().toString();
                    //sdate2=date.getText().toString();
                    sdate=""+BdayDate.date;

                    str = "Name:" + nm.getText().toString() + "Phone No:" + no.getText().toString() + "Date:" + sdate;
                    if(!snm2.equals("")&&!sno2.equals("")&&!sdate.equals("")&& !sdate.equals("null")) {
                        if (isValidPhoneNumber(sno2))
                        {
                            AlertDialog.Builder ad = new AlertDialog.Builder(bday.this);
                            ad.setTitle("Booking:");
                            ad.setMessage(str);
                            ad.setPositiveButton("Book", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    if(isConnected())
                                        placeOrder(str);
                                    else
                                        Snackbar.make(findViewById(R.id.main_content), "Please check the data connection !", Snackbar.LENGTH_LONG).show();
                                }
                            });
                            ad.show();
                        }else
                        {
                            AlertDialog.Builder ad1 = new AlertDialog.Builder(bday.this);
                            ad1.setTitle("Invalid");
                            ad1.setMessage("Please enter the valid phone no");
                            ad1.show();
                        }
                    }
                    else
                    {
                        AlertDialog.Builder ad2 = new AlertDialog.Builder(bday.this);
                        ad2.setTitle("Sorry !!");
                        ad2.setMessage("Please enter all the fields");
                        ad2.show();
                    }

                }


            });
        }catch (Exception e){
            e.printStackTrace();
            Log.e("eXCEPTION:",""+e);
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
                                myRef.child("Birthday Bookings").child("" + no).setValue(str).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        pd.dismiss();
                                        Toast.makeText(getApplicationContext(), "Thank you for showing interest in Zaika, we will call you shortly !", Toast.LENGTH_LONG).show();
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
            Toast.makeText(getApplicationContext(), "Exception:"+e, Toast.LENGTH_SHORT).show();

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
