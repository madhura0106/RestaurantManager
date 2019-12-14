package com.example.jarvis.pro10;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by it on 4/17/2017.
 */

public class Tab3_Ice_Cream extends Fragment{
    static String[] menu3;
    static int[] price3;
    static int[] cnt3;
    static TextView i1;
    static TextView i2;
    static TextView i3;
    static TextView i4;
    static TextView i5;
    static TextView i6;
    static TextView i7;
    static TextView i8;
    static TextView i9;

    Button binc31;
    Button binc32;
    Button binc33;
    Button binc34;
    Button binc35;
    Button binc36;
    Button binc37;
    Button binc38;
    Button binc39;

    Button bdec31;
    Button bdec32;
    Button bdec33;
    Button bdec34;
    Button bdec35;
    Button bdec36;
    Button bdec37;
    Button bdec38;
    Button bdec39;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3icecream, container, false);

        menu3 = new String[]{"Apricot IceCream","Chocolate IceCream","Mango IceCream","Mangolassi IceCream","Masala Chai IceCream","Strawberry Meringuei IceCream","Thandai IcaCream","Vegan Chocolate IceCream","Vanilla IceCream"};
        price3 = new int[]{85,50,55,100,90,70,90,110,55};

        i1 = (TextView) rootView.findViewById(R.id.i1);
        i2 = (TextView) rootView.findViewById(R.id.i2);
        i3 = (TextView) rootView.findViewById(R.id.i3);
        i4 = (TextView) rootView.findViewById(R.id.i4);
        i5 = (TextView) rootView.findViewById(R.id.i5);
        i6 = (TextView) rootView.findViewById(R.id.i6);
        i7 = (TextView) rootView.findViewById(R.id.i7);
        i8 = (TextView) rootView.findViewById(R.id.i8);
        i9 = (TextView) rootView.findViewById(R.id.i9);

        binc31 = (Button) rootView.findViewById(R.id.binc31);
        binc32 = (Button) rootView.findViewById(R.id.binc32);
        binc33 = (Button) rootView.findViewById(R.id.binc33);
        binc34 = (Button) rootView.findViewById(R.id.binc34);
        binc35 = (Button) rootView.findViewById(R.id.binc35);
        binc36 = (Button) rootView.findViewById(R.id.binc36);
        binc37 = (Button) rootView.findViewById(R.id.binc37);
        binc38 = (Button) rootView.findViewById(R.id.binc38);
        binc39 = (Button) rootView.findViewById(R.id.binc39);

        bdec31 = (Button) rootView.findViewById(R.id.bdec31);
        bdec32 = (Button) rootView.findViewById(R.id.bdec32);
        bdec33 = (Button) rootView.findViewById(R.id.bdec33);
        bdec34 = (Button) rootView.findViewById(R.id.bdec34);
        bdec35 = (Button) rootView.findViewById(R.id.bdec35);
        bdec36 = (Button) rootView.findViewById(R.id.bdec36);
        bdec37 = (Button) rootView.findViewById(R.id.bdec37);
        bdec38 = (Button) rootView.findViewById(R.id.bdec38);
        bdec39 = (Button) rootView.findViewById(R.id.bdec39);

        cnt3 = new int[9];
        /*binc31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int qty = Integer.parseInt(i1.getText().toString());
                    qty++;
                    i1.setText(""+qty);
                   *//* Log.e("qty",""+p1.getText().toString());*//*
                }
                catch (Exception e)
                {
                    i1.setText("Enter valid number");
                }
            }
        });
        binc32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) i2.getText());
                    iqty11++;
                    i2.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    i2.setText("Enter valid number");
                }
            }
        });
        binc33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) i3.getText());
                    iqty11++;
                    i3.setText(iqty11 + "");
                   *//* Log.e("iqty13",""+""+p3.getText().toString());*//*
                }
                catch (Exception e)
                {
                    i3.setText("Enter valid number");
                }
            }
        });
        binc34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) i4.getText());
                    iqty11++;
                    i4.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    i4.setText("Enter valid number");
                }
            }
        });
        binc35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) i5.getText());
                    iqty11++;
                    i5.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    i5.setText("Enter valid number");
                }
            }
        });
        binc36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) i6.getText());
                    iqty11++;
                    i6.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    i6.setText("Enter valid number");
                }
            }
        });
        binc37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) i7.getText());
                    iqty11++;
                    i7.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    i7.setText("Enter valid number");
                }
            }
        });
        binc38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) i8.getText());
                    iqty11++;
                    i8.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    i8.setText("Enter valid number");
                }
            }
        });
        binc39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) i9.getText());
                    iqty11++;
                    i9.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    i9.setText("Enter valid number");
                }
            }
        });


        bdec31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) i1.getText());
                    if (dqty11 == 0)
                        i1.setText(""+0);
                    else {
                        dqty11--;
                        i1.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    i1.setText("Enter valid number");
                }
            }
        });
        bdec32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) i2.getText());
                    if (dqty11 == 0)
                        i2.setText(""+0);
                    else {
                        dqty11--;
                        i2.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    i2.setText("Enter valid number");
                }
            }
        });
        bdec33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) i3.getText());
                    if (dqty11 == 0)
                        i3.setText(""+0);
                    else {
                        dqty11--;
                        i3.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    i3.setText("Enter valid number");
                }
            }
        });
        bdec34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) i4.getText());
                    if (dqty11 == 0)
                        i4.setText(""+0);
                    else {
                        dqty11--;
                        i4.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    i4.setText("Enter valid number");
                }
            }
        });
        bdec35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) i5.getText());
                    if (dqty11 == 0)
                        i5.setText(""+0);
                    else {
                        dqty11--;
                        i5.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    i5.setText("Enter valid number");
                }
            }
        });
        bdec36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) i6.getText());
                    if (dqty11 == 0)
                        i6.setText(""+0);
                    else {
                        dqty11--;
                        i6.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    i6.setText("Enter valid number");
                }
            }
        });
        bdec37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) i7.getText());
                    if (dqty11 == 0)
                        i7.setText(""+0);
                    else {
                        dqty11--;
                        i7.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    i7.setText("Enter valid number");
                }
            }
        });
        bdec38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) i8.getText());
                    if (dqty11 == 0)
                        i8.setText(""+0);
                    else {
                        dqty11--;
                        i8.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    i8.setText("Enter valid number");
                }
            }
        });
        bdec39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) i9.getText());
                    if (dqty11 == 0)
                        i9.setText(""+0);
                    else {
                        dqty11--;
                        i9.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    i9.setText("Enter valid number");
                }
            }
        });*/
        /*binc31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Log.e("in","try");
                    ForTabData.flg3=1;
                    int qty = Integer.parseInt((String) i1.getText());
                    Log.e("In code",""+qty);
                    qty++;
                    ForTabData.cnt3[0]=qty;
                    i1.setText(""+ForTabData.cnt3[0]);
                   *//* Log.e("qty",""+p1.getText().toString());*//*
                }
                catch (Exception e)
                {
                    i1.setText("Enter valid number");
                }
            }
        });*/
        binc31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3 = 1;
                    int iqty = Integer.parseInt(i1.getText().toString());
                    iqty++;
                    ForTabData.cnt3[0] = iqty;
                    i1.setText("" + ForTabData.cnt3[0]);
                }catch(Exception e)
                {
                    i1.setText("Enter valid number");
                }
            }
        });
        binc32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) i2.getText());
                    iqty11++;
                    ForTabData.cnt3[1]=iqty11;
                    i2.setText(ForTabData.cnt3[1]+ "");
                }
                catch (Exception e)
                {
                    i2.setText("Enter valid number");
                }
            }
        });
        binc33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) i3.getText());
                    iqty11++;
                    ForTabData.cnt3[2]=iqty11;
                    i3.setText(ForTabData.cnt3[2]+ "");
                   /* Log.e("iqty13",""+""+p3.getText().toString());*/
                }
                catch (Exception e)
                {
                    i3.setText("Enter valid number");
                }
            }
        });
        binc34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) i4.getText());
                    iqty11++;
                    ForTabData.cnt3[3]=iqty11;
                    i4.setText(ForTabData.cnt3[3]+ "");
                }
                catch (Exception e)
                {
                    i4.setText("Enter valid number");
                }
            }
        });
        binc35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) i5.getText());
                    iqty11++;
                    ForTabData.cnt3[4]=iqty11;

                    i5.setText(ForTabData.cnt3[4]+ "");
                }
                catch (Exception e)
                {
                    i5.setText("Enter valid number");
                }
            }
        });
        binc36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) i6.getText());
                    iqty11++;
                    ForTabData.cnt3[5]=iqty11;
                    i6.setText(ForTabData.cnt3[5]+ "");
                }
                catch (Exception e)
                {
                    i6.setText("Enter valid number");
                }
            }
        });
        binc37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) i7.getText());
                    iqty11++;
                    ForTabData.cnt3[6]=iqty11;
                    i7.setText(ForTabData.cnt3[6]+ "");
                }
                catch (Exception e)
                {
                    i7.setText("Enter valid number");
                }
            }
        });
        binc38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) i8.getText());
                    iqty11++;
                    ForTabData.cnt3[7]=iqty11;
                    i8.setText(ForTabData.cnt3[7]+ "");
                }
                catch (Exception e)
                {
                    i8.setText("Enter valid number");
                }
            }
        });
        binc39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) i9.getText());
                    iqty11++;
                    ForTabData.cnt3[8]=iqty11;
                    i9.setText(ForTabData.cnt3[8]+ "");
                }
                catch (Exception e)
                {
                    i9.setText("Enter valid number");
                }
            }
        });

        bdec31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[0] == 0)
                        i1.setText(""+0);
                    else {
                        ForTabData.cnt3[0]--;
                        i1.setText(""+ForTabData.cnt3[0] );
                    }
                }catch (Exception e)
                {
                    i1.setText("Enter valid number");
                }
            }
        });
        bdec32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    // int dqty11 = Integer.parseInt((String) p2.getText());
                    if (ForTabData.cnt3[1]== 0)
                        i2.setText(""+0);
                    else {
                        ForTabData.cnt3[1]--;
                        i2.setText(""+ForTabData.cnt3[1]);
                    }
                }catch (Exception e)
                {
                    i2.setText("Enter valid number");
                }
            }
        });
        bdec33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[2] == 0)
                        i3.setText(""+0);
                    else {
                        ForTabData.cnt3[2]--;
                        i3.setText(""+ForTabData.cnt3[2] );
                    }
                }catch (Exception e)
                {
                    i3.setText("Enter valid number");
                }
            }
        });
        bdec34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[3] == 0)
                        i4.setText(""+0);
                    else {
                        ForTabData.cnt3[3]--;
                        i4.setText(""+ForTabData.cnt3[3] );
                    }
                }catch (Exception e)
                {
                    i4.setText("Enter valid number");
                }
            }
        });
        bdec35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[4] == 0)
                        i5.setText(""+0);
                    else {
                        ForTabData.cnt3[4]--;
                        i5.setText(""+ForTabData.cnt3[4] );
                    }
                }catch (Exception e)
                {
                    i5.setText("Enter valid number");
                }
            }
        });
        bdec36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[5] == 0)
                        i6.setText(""+0);
                    else {
                        ForTabData.cnt3[5]--;
                        i6.setText(""+ForTabData.cnt3[5] );
                    }
                }catch (Exception e)
                {
                    i6.setText("Enter valid number");
                }
            }
        });
        bdec37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[6] == 0)
                        i7.setText(""+0);
                    else {
                        ForTabData.cnt3[6]--;
                        i7.setText(""+ForTabData.cnt3[6] );
                    }
                }catch (Exception e)
                {
                    i7.setText("Enter valid number");
                }
            }
        });
        bdec38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[7] == 0)
                        i8.setText(""+0);
                    else {
                        ForTabData.cnt3[7]--;
                        i8.setText(""+ForTabData.cnt3[7] );
                    }
                }catch (Exception e)
                {
                    i8.setText("Enter valid number");
                }
            }
        });
        bdec39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[8] == 0)
                        i9.setText(""+0);
                    else {
                        ForTabData.cnt3[0]--;
                        i9.setText(""+ForTabData.cnt3[8] );
                    }
                }catch (Exception e)
                {
                    i9.setText("Enter valid number");
                }
            }
        });



        return rootView;
    }

}
