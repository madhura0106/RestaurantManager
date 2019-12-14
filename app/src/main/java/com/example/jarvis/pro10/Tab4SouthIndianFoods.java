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

public class Tab4SouthIndianFoods extends Fragment {
    static String[] menu4;
    static int[] price4;
    static int[] cnt4;
    static TextView so1;
    static TextView so2;
    static TextView so3;
    static TextView so4;
    static TextView so5;
    static TextView so6;
    static TextView so7;
    static TextView so8;
    static TextView so9;

    Button binc41;
    Button binc42;
    Button binc43;
    Button binc44;
    Button binc45;
    Button binc46;
    Button binc47;
    Button binc48;
    Button binc49;

    Button bdec41;
    Button bdec42;
    Button bdec43;
    Button bdec44;
    Button bdec45;
    Button bdec46;
    Button bdec47;
    Button bdec48;
    Button bdec49;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab4southindianfoods, container, false);


        menu4=new String[]{"Appams","Ava Dosa","Cheese Chilli Dosa","Greengram Dosa","Hyderabadi Biryani","Idli Sambhar","Mysore Masala Dosa","Neer Dosa","Faraali Idli Sambhar"};
        price4=new int[]{70,90,100,110,150,60,77,65,110};

        so1 = (TextView) rootView.findViewById(R.id.so1);
        so2 = (TextView) rootView.findViewById(R.id.so2);
        so3 = (TextView) rootView.findViewById(R.id.so3);
        so4 = (TextView) rootView.findViewById(R.id.so4);
        so5 = (TextView) rootView.findViewById(R.id.so5);
        so6 = (TextView) rootView.findViewById(R.id.so6);
        so7 = (TextView) rootView.findViewById(R.id.so7);
        so8 = (TextView) rootView.findViewById(R.id.so8);
        so9 = (TextView) rootView.findViewById(R.id.so9);

        binc41 = (Button) rootView.findViewById(R.id.binc41);
        binc42 = (Button) rootView.findViewById(R.id.binc42);
        binc43 = (Button) rootView.findViewById(R.id.binc43);
        binc44 = (Button) rootView.findViewById(R.id.binc44);
        binc45 = (Button) rootView.findViewById(R.id.binc45);
        binc46 = (Button) rootView.findViewById(R.id.binc46);
        binc47 = (Button) rootView.findViewById(R.id.binc47);
        binc48 = (Button) rootView.findViewById(R.id.binc48);
        binc49 = (Button) rootView.findViewById(R.id.binc49);

        bdec41 = (Button) rootView.findViewById(R.id.bdec41);
        bdec42 = (Button) rootView.findViewById(R.id.bdec42);
        bdec43 = (Button) rootView.findViewById(R.id.bdec43);
        bdec44 = (Button) rootView.findViewById(R.id.bdec44);
        bdec45 = (Button) rootView.findViewById(R.id.bdec45);
        bdec46 = (Button) rootView.findViewById(R.id.bdec46);
        bdec47 = (Button) rootView.findViewById(R.id.bdec47);
        bdec48 = (Button) rootView.findViewById(R.id.bdec48);
        bdec49 = (Button) rootView.findViewById(R.id.bdec49);

        cnt4 = new int[9];
       /* binc41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int qty = Integer.parseInt((String) so1.getText());
                    qty++;
                    so1.setText(qty+ "");
                   *//* Log.e("qty",""+p1.getText().toString());*//*
                }
                catch (Exception e)
                {
                    so1.setText("Enter valid number");
                }
            }
        });
        binc42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) so2.getText());
                    iqty11++;
                    so2.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    so2.setText("Enter valid number");
                }
            }
        });
        binc43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) so3.getText());
                    iqty11++;
                    so3.setText(iqty11 + "");
                   *//* Log.e("iqty13",""+""+p3.getText().toString());*//*
                }
                catch (Exception e)
                {
                    so3.setText("Enter valid number");
                }
            }
        });
        binc44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) so4.getText());
                    iqty11++;
                    so4.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    so4.setText("Enter valid number");
                }
            }
        });
        binc45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) so5.getText());
                    iqty11++;
                    so5.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    so5.setText("Enter valid number");
                }
            }
        });
        binc46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) so6.getText());
                    iqty11++;
                    so6.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    so6.setText("Enter valid number");
                }
            }
        });
        binc47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) so7.getText());
                    iqty11++;
                    so7.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    so7.setText("Enter valid number");
                }
            }
        });
        binc48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) so8.getText());
                    iqty11++;
                    so8.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    so8.setText("Enter valid number");
                }
            }
        });
        binc49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) so9.getText());
                    iqty11++;
                    so9.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    so9.setText("Enter valid number");
                }
            }
        });


        bdec41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) so1.getText());
                    if (dqty11 == 0)
                        so1.setText(""+0);
                    else {
                        dqty11--;
                        so1.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    so1.setText("Enter valid number");
                }
            }
        });
        bdec42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) so2.getText());
                    if (dqty11 == 0)
                        so2.setText(""+0);
                    else {
                        dqty11--;
                        so2.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    so2.setText("Enter valid number");
                }
            }
        });
        bdec43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) so3.getText());
                    if (dqty11 == 0)
                        so3.setText(""+0);
                    else {
                        dqty11--;
                        so3.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    so3.setText("Enter valid number");
                }
            }
        });
        bdec44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) so4.getText());
                    if (dqty11 == 0)
                        so4.setText(""+0);
                    else {
                        dqty11--;
                        so4.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    so4.setText("Enter valid number");
                }
            }
        });
        bdec45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) so5.getText());
                    if (dqty11 == 0)
                        so5.setText(""+0);
                    else {
                        dqty11--;
                        so5.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    so5.setText("Enter valid number");
                }
            }
        });
        bdec46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) so6.getText());
                    if (dqty11 == 0)
                        so6.setText(""+0);
                    else {
                        dqty11--;
                        so6.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    so6.setText("Enter valid number");
                }
            }
        });
        bdec47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) so7.getText());
                    if (dqty11 == 0)
                        so7.setText(""+0);
                    else {
                        dqty11--;
                        so7.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    so7.setText("Enter valid number");
                }
            }
        });
        bdec48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) so8.getText());
                    if (dqty11 == 0)
                        so8.setText(""+0);
                    else {
                        dqty11--;
                        so8.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    so8.setText("Enter valid number");
                }
            }
        });
        bdec49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) so9.getText());
                    if (dqty11 == 0)
                        so9.setText(""+0);
                    else {
                        dqty11--;
                        so9.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    so9.setText("Enter valid number");
                }
            }
        });
*/
        binc41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg4=1;
                    int qty = Integer.parseInt((String) so1.getText());
                    qty++;
                    ForTabData.cnt4[0]=qty;
                    so1.setText(ForTabData.cnt4[0]+ "");
                   /* Log.e("qty",""+p1.getText().toString());*/
                }
                catch (Exception e)
                {
                    so1.setText("Enter valid number");
                }
            }
        });
        binc42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg4=1;
                    int iqty11 = Integer.parseInt((String) so2.getText());
                    iqty11++;
                    ForTabData.cnt4[1]=iqty11;
                    so2.setText(ForTabData.cnt4[1]+ "");
                }
                catch (Exception e)
                {
                    so2.setText("Enter valid number");
                }
            }
        });
        binc43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg4=1;
                    int iqty11 = Integer.parseInt((String) so3.getText());
                    iqty11++;
                    ForTabData.cnt4[2]=iqty11;
                    so3.setText(ForTabData.cnt4[2]+ "");
                   /* Log.e("iqty13",""+""+p3.getText().toString());*/
                }
                catch (Exception e)
                {
                    so3.setText("Enter valid number");
                }
            }
        });
        binc44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg4=1;
                    int iqty11 = Integer.parseInt((String) so4.getText());
                    iqty11++;
                    ForTabData.cnt4[3]=iqty11;
                    so4.setText(ForTabData.cnt4[3]+ "");
                }
                catch (Exception e)
                {
                    so4.setText("Enter valid number");
                }
            }
        });
        binc45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg4=1;
                    int iqty11 = Integer.parseInt((String) so5.getText());
                    iqty11++;
                    ForTabData.cnt4[4]=iqty11;

                    so5.setText(ForTabData.cnt4[4]+ "");
                }
                catch (Exception e)
                {
                    so5.setText("Enter valid number");
                }
            }
        });
        binc46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg4=1;
                    int iqty11 = Integer.parseInt((String) so6.getText());
                    iqty11++;
                    ForTabData.cnt4[5]=iqty11;
                    so6.setText(ForTabData.cnt4[5]+ "");
                }
                catch (Exception e)
                {
                    so6.setText("Enter valid number");
                }
            }
        });
        binc47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg4=1;
                    int iqty11 = Integer.parseInt((String) so7.getText());
                    iqty11++;
                    ForTabData.cnt4[6]=iqty11;
                    so7.setText(ForTabData.cnt4[6]+ "");
                }
                catch (Exception e)
                {
                    so7.setText("Enter valid number");
                }
            }
        });
        binc48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg4=1;
                    int iqty11 = Integer.parseInt((String) so8.getText());
                    iqty11++;
                    ForTabData.cnt4[7]=iqty11;
                    so8.setText(ForTabData.cnt4[7]+ "");
                }
                catch (Exception e)
                {
                    so8.setText("Enter valid number");
                }
            }
        });
        binc49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg4=1;
                    int iqty11 = Integer.parseInt((String) so9.getText());
                    iqty11++;
                    ForTabData.cnt4[8]=iqty11;
                    so9.setText(ForTabData.cnt4[8]+ "");
                }
                catch (Exception e)
                {
                    so9.setText("Enter valid number");
                }
            }
        });

        bdec41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt4[0] == 0)
                        so1.setText(""+0);
                    else {
                        ForTabData.cnt4[0]--;
                        so1.setText(""+ForTabData.cnt4[0] );
                    }
                }catch (Exception e)
                {
                    so1.setText("Enter valid number");
                }
            }
        });
        bdec42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    // int dqty11 = Integer.parseInt((String) p2.getText());
                    if (ForTabData.cnt4[1]== 0)
                        so2.setText(""+0);
                    else {
                        ForTabData.cnt4[1]--;
                        so2.setText(""+ForTabData.cnt4[1]);
                    }
                }catch (Exception e)
                {
                    so2.setText("Enter valid number");
                }
            }
        });
        bdec43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt4[2] == 0)
                        so3.setText(""+0);
                    else {
                        ForTabData.cnt4[2]--;
                        so3.setText(""+ForTabData.cnt4[2] );
                    }
                }catch (Exception e)
                {
                    so3.setText("Enter valid number");
                }
            }
        });
        bdec44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt4[3] == 0)
                        so4.setText(""+0);
                    else {
                        ForTabData.cnt4[3]--;
                        so4.setText(""+ForTabData.cnt4[3] );
                    }
                }catch (Exception e)
                {
                    so4.setText("Enter valid number");
                }
            }
        });
        bdec45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt4[4] == 0)
                        so5.setText(""+0);
                    else {
                        ForTabData.cnt4[4]--;
                        so5.setText(""+ForTabData.cnt4[4] );
                    }
                }catch (Exception e)
                {
                    so5.setText("Enter valid number");
                }
            }
        });
        bdec46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt4[5] == 0)
                        so6.setText(""+0);
                    else {
                        ForTabData.cnt4[5]--;
                        so6.setText(""+ForTabData.cnt4[5] );
                    }
                }catch (Exception e)
                {
                    so6.setText("Enter valid number");
                }
            }
        });
        bdec47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt4[6] == 0)
                        so7.setText(""+0);
                    else {
                        ForTabData.cnt4[6]--;
                        so7.setText(""+ForTabData.cnt4[6] );
                    }
                }catch (Exception e)
                {
                    so7.setText("Enter valid number");
                }
            }
        });
        bdec48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt4[7] == 0)
                        so8.setText(""+0);
                    else {
                        ForTabData.cnt4[7]--;
                        so8.setText(""+ForTabData.cnt4[7] );
                    }
                }catch (Exception e)
                {
                    so8.setText("Enter valid number");
                }
            }
        });
        bdec49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt4[8] == 0)
                        so9.setText(""+0);
                    else {
                        ForTabData.cnt4[0]--;
                        so9.setText(""+ForTabData.cnt4[8] );
                    }
                }catch (Exception e)
                {
                    so9.setText("Enter valid number");
                }
            }
        });

        return rootView;
    }
}
