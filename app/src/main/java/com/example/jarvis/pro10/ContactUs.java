package com.example.jarvis.pro10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static android.R.attr.phoneNumber;

/**
 * Created by it on 4/15/2017.
 */

public class ContactUs extends AppCompatActivity {

        Button b1;
        Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us);

        b1 = (Button) findViewById(R.id.callbut1);

        b1.setOnClickListener(new View.OnClickListener() {


                                  @Override
                                  public void onClick(View v) {
                                      dialContactPhone1("56789");
                                  }

                              }
        );

        b2 = (Button) findViewById(R.id.callbut1);

        b2.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {


                                     // Intent callIntent = new Intent(Intent.ACTION_CALL);
                                      //callIntent.setData(Uri.parse("tel:7218642797"));
                                      // startActivity(callIntent);
                                      dialContactPhone2("53570");
                                  }
                              }
        );
    }
        public void dialContactPhone1(final String phoneNumber)
        {
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));

            //Intent callIntent=new Intent(Intent.ACTION_CALL);
            //callIntent.setData(Uri.parse("tel:8857992585"));
            //startActivity(callIntent);
        }

    public void dialContactPhone2(final String phoneNumber)
    {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));

        //Intent callIntent=new Intent(Intent.ACTION_CALL);
        //callIntent.setData(Uri.parse("tel:8857992585"));
        //startActivity(callIntent);
    }
    }

