package com.example.jarvis.pro10;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Home extends AppCompatActivity {
    ImageButton border;
    int bill=0;
    String str1="";
    String str2="";
    String str3="";
    String str4="";
    String str5="";
    String str="";
    static String s="";
    static EditText tablno;
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        int b1=0, b2=0, b3=0, b4=0, b5=0;
        if (id == R.id.action_order) {
            try
            {
                for (int i = 0; i < 10; i++) {
                    if (ForTabData.cnt1[i] != 0 ) {
                        b1 = b1 + Tab1PanjabiFood.price1[i] * ForTabData.cnt1[i];
                        str1 += Tab1PanjabiFood.menu1[i] + "(" + ForTabData.cnt1[i] + ")="+Tab1PanjabiFood.price1[i] * ForTabData.cnt1[i]+",";
                    }
                }
                for(int i=0;i<9;i++)
                {
                    if(ForTabData.cnt2[i] != 0)
                    {
                        b2 = b2 + Tab2Starter.price2[i] * ForTabData.cnt2[i];
                        str2 += Tab2Starter.menu2[i] + "(" + ForTabData.cnt2[i] + ")="+Tab2Starter.price2[i] * ForTabData.cnt2[i]+",";
                    }
                }
                for(int i=0;i<9;i++)
                {
                    if(ForTabData.cnt3[i] != 0)
                    {
                        b3 = b3 + Tab3_Ice_Cream.price3[i] * ForTabData.cnt3[i];
                        str3 += Tab3_Ice_Cream.menu3[i] + "(" + ForTabData.cnt3[i] + ")=" + Tab3_Ice_Cream.price3[i] * ForTabData.cnt3[i]+",";
                    }
                }
                for(int i=0;i<9;i++)
                {
                    if(ForTabData.cnt4[i] != 0)
                    {
                        b4 = b4 + Tab4SouthIndianFoods.price4[i] * ForTabData.cnt4[i];
                        str4 += Tab4SouthIndianFoods.menu4[i] + "(" + ForTabData.cnt4[i] + ")=" + Tab4SouthIndianFoods.price4[i] * ForTabData.cnt4[i]+",";
                    }
                }
                for(int i=0;i<9;i++)
                {
                    if(ForTabData.cnt5[i] != 0)
                    {
                        b5 = b5 + Tab5SaladAndRaita.price5[i] * ForTabData.cnt5[i];
                        str5 += Tab5SaladAndRaita.menu5[i] + "(" + ForTabData.cnt5[i] + ")=" + Tab5SaladAndRaita.price5[i] * ForTabData.cnt5[i]+",";
                    }
                }
                bill=b1+b2+b3+b4+b5;
                str = MainActivity.tablno+":"+str1+str2+ str3+ str4+str5+"Bill="+bill;
                Log.e("table no",""+MainActivity.tablno);
                s = "Punjabi : "+b1+"\nStarter : "+b2+"\nIceCream : "+b3+"\nSouth Indian : "+b4+"\nSalad & Raitas : "+b5+"\n\nTotal=" + bill;
                AlertDialog.Builder ad = new AlertDialog.Builder(this);
                ad.setTitle("Bill:");
                ad.setMessage(s);
                ad.setPositiveButton("Place", new DialogInterface.OnClickListener() {
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


            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.tab1panjabifood, container, false);

            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch(position)
            {
                case 0:
                    Tab1PanjabiFood t1=new Tab1PanjabiFood();
                    return t1;
                case 1:
                    Tab2Starter t2=new Tab2Starter();
                    return t2;
                case 2:
                    Tab3_Ice_Cream t3=new Tab3_Ice_Cream();
                    return t3;
                case 3:
                    Tab4SouthIndianFoods t4=new Tab4SouthIndianFoods();
                    return t4;
                case 4:
                    Tab5SaladAndRaita t5=new Tab5SaladAndRaita();
                    return t5;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Punjabi Food";
                case 1:
                    return "Starter";
                case 2:
                    return "Ice-Cream";
                case 3:
                    return "South-Indian Foods";
                case 4:
                    return "Salad And Raitas";
            }
            return null;
        }
    }

    private void placeOrder(final String str){
        try {
            final Activity act = this;
            final ProgressDialog pd = new ProgressDialog(act);
            pd.setCancelable(true);
            pd.setMessage("Placing Order...");
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
                                myRef.child("orders").child("" + no).setValue(str).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        pd.dismiss();
                                        Toast.makeText(getApplicationContext(), "Order Placed !", Toast.LENGTH_SHORT).show();
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