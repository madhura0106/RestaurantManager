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

import static android.R.string.no;
import static com.example.jarvis.pro10.Feedback.isValidPhoneNumber;

public class BookTable extends AppCompatActivity {
    EditText tno;
    Button tdate;

    Button ttime;
    EditText tfirst;
    EditText tlast;
    EditText tmail;
    EditText tphone;
    EditText ttext;
    String str;
    Button tablsubmit;
    String st;
    String sd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_table);

        try {
            tablsubmit = (Button) findViewById(R.id.tablsubmit);
        }catch (Exception e){}


        tno = (EditText) findViewById(R.id.tno);

sd="";
        st="";
        tfirst = (EditText) findViewById(R.id.tfirst);
        tlast = (EditText) findViewById(R.id.tlast);
        tmail = (EditText) findViewById(R.id.tmail);
        tphone = (EditText) findViewById(R.id.tphone);
        ttext = (EditText) findViewById(R.id.ttext);



        try
        {
            ttime = (Button) findViewById(R.id.bttime);
            tdate = (Button) findViewById(R.id.btdate);
        }
        catch(Exception e) {}

        ttime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new CatTime();
                newFragment.show(getSupportFragmentManager(), "timePicker");
            }
        });

        tdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TablDate();

                newFragment.show(getSupportFragmentManager(), "datePicker");
            }
        });




        try {
            tablsubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                   // String sdate3=tdate.getText().toString();
                    String sno3=tno.getText().toString();
                   // String stime3=ttime.getText().toString();
                    String sfirst3=tfirst.getText().toString();
                    String spno3=tphone.getText().toString();
                    String slast3=tlast.getText().toString();
                    String smail3=tmail.getText().toString();
                   // String stext3=ttime.getText().toString();
                    String[] semail = new String[1];



                    semail[0] = tmail.getText().toString().trim();

                    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                    sd=""+TablDate.date;
                    st=""+CatTime.time;

                    str = "Date:" +sd + "No Of Guests:" + tno.getText().toString() + "Time:" + st + "First Name:" + tfirst.getText().toString()+"Last Name:"+tlast.getText().toString()+"email:"+tmail.getText().toString()+"Phone No:"+tphone.getText().toString()+"Additional Requests:"+ttext.getText().toString();


                    if(!sd.equals("null")&& !sd.equals(""+null)&& !st.equals("null")&&!sd.equals(""+null)&&!sd.equals("")&&!sno3.equals("")&&!st.equals("")&&!sfirst3.equals("")&&!slast3.equals("")&&!spno3.equals("")&&!smail3.equals("")) {
                        if (semail[0].matches(emailPattern) && isValidPhoneNumber(spno3)) {
                            AlertDialog.Builder ad = new AlertDialog.Builder(BookTable.this);
                            ad.setTitle("Booking:");
                            ad.setMessage(str);
                            ad.setPositiveButton("Book", new DialogInterface.OnClickListener() {
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
                        }
                        else if (!semail[0].matches(emailPattern) && !isValidPhoneNumber(spno3)) {
                            AlertDialog.Builder ad1= new AlertDialog.Builder(BookTable.this);
                            ad1.setTitle("Invalid");
                            ad1.setMessage("Please enter the valid email address and phone:");
                            ad1.show();
                            Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
                            // Toast.makeText(getApplicationContext(), "Invalid email address and phone no", Toast.LENGTH_SHORT).show();
                        } else if (!semail[0].matches(emailPattern)) {
                            AlertDialog.Builder ad2 = new AlertDialog.Builder(BookTable.this);
                            ad2.setTitle("Invalid");
                            ad2.setMessage("Please enter the valid email address:");
                            ad2.show();
                            // Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
                        } else if (!isValidPhoneNumber(spno3)) {
                            AlertDialog.Builder ad3 = new AlertDialog.Builder(BookTable.this);
                            ad3.setTitle("Invalid");
                            ad3.setMessage("Please enter the valid phone no");
                            ad3.show();
                            //Toast.makeText(getApplicationContext(), "Invalid number", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        AlertDialog.Builder ad4 = new AlertDialog.Builder(BookTable.this);
                        ad4.setTitle("Sorry !!");
                        ad4.setMessage("Please enter all the fields");
                        ad4.show();
                        //Toast.makeText(getApplicationContext(), "Please enter all the fields.", Toast.LENGTH_SHORT).show();
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
                                myRef.child("Table Bookings").child("" + no).setValue(str).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        pd.dismiss();
                                        Toast.makeText(getApplicationContext(), "Thank you for showing interest in Zaika, we will call you shortly !", Toast.LENGTH_LONG).show();
                                        act.finish();
                                    }
                                });
                            } else {
                                pd.dismiss();
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
