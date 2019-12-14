package com.example.jarvis.pro10;

import android.content.DialogInterface;
import android.content.Intent;
import android.icu.lang.UCharacterEnums;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.text.InputType;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
EditText tablno1;
 static String tablno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ImageButton bday=(ImageButton) findViewById(R.id.bdaybttn);
        bday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,bday.class);
                startActivity(i1);
            }
        });
        ImageButton cat=(ImageButton) findViewById(R.id.catbttn);

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(MainActivity.this,catering.class);
                startActivity(i2);
            }
        });

        ImageButton table=(ImageButton) findViewById(R.id.tblbttn);

        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(MainActivity.this,BookTable.class);
                startActivity(i3);
            }
        });

        ImageButton menu=(ImageButton) findViewById(R.id.menubttn) ;
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder ad1=new AlertDialog.Builder(MainActivity.this);
                ad1.setTitle("Table no");
               ad1.setMessage("Enter Table No:");
             /*  View view=getLayoutInflater().inflate(R.layout.dialog_login,null);
                EditText nota=(EditText)view.findViewById(R.id.nota);
                try{
                tablno=nota.getText().toString();}
                catch(Exception e){Log.e("tabn no",""+tablno);};*/


                 final EditText input = new EditText(MainActivity.this);


LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(

                       LinearLayout.LayoutParams.MATCH_PARENT,
                       LinearLayout.LayoutParams.MATCH_PARENT);
               input.setInputType(InputType.TYPE_CLASS_NUMBER);
                input.setLayoutParams(lp);
                ad1.setView(input);
               Log.e("tabn no",""+tablno);
                ad1.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tablno=input.getText().toString();

                        Intent i3=new Intent(MainActivity.this,Home.class);
                        startActivity(i3);


                    }
                });
                ad1.show();
            }
        });
/*
        Button b1=(Button) findViewById(R.id.email_sign_in_button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText emailValidate = (EditText)findViewById(R.id.email);

                final TextView textView = (TextView)findViewById(R.id.text);

                String email = emailValidate.getText().toString().trim();

                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

// onClick of button perform this simplest code.
                if (email.matches(emailPattern))
                {
                    Toast.makeText(getApplicationContext(),"valid email address",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid email address", Toast.LENGTH_SHORT).show();
                }
            }
        }


        );

*/



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        if (id == R.id.about_us) {

            Intent i4=new Intent(MainActivity.this,AboutUs.class);
            startActivity(i4);
        } else if (id == R.id.contactus) {
            Intent i4=new Intent(MainActivity.this,ContactUs.class);
            startActivity(i4);

        } else if (id == R.id.feedback) {

            Intent i4=new Intent(MainActivity.this,Feedback.class);
            startActivity(i4);
        }
        else if(id==R.id.managers_login)
        {
            Intent i3=new Intent(MainActivity.this,LoginActivity.class);
            startActivity(i3);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }





}
