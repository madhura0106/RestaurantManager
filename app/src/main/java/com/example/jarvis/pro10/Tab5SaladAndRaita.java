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

public class Tab5SaladAndRaita extends Fragment {
    static String[] menu5;
    static int[] price5;
    static int[] cnt5;
    static TextView sa1;
    static TextView sa2;
    static TextView sa3;
    static TextView sa4;
    static TextView sa5;
    static TextView sa6;
    static TextView sa7;
    static TextView sa8;
    static TextView sa9;

    Button binc51;
    Button binc52;
    Button binc53;
    Button binc54;
    Button binc55;
    Button binc56;
    Button binc57;
    Button binc58;
    Button binc59;

    Button bdec51;
    Button bdec52;
    Button bdec53;
    Button bdec54;
    Button bdec55;
    Button bdec56;
    Button bdec57;
    Button bdec58;
    Button bdec59;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View rootView = inflater.inflate(R.layout.tab5saladandraita, container, false);


        menu5=new String[]{"Green Chilli Raita","Kheer Ka Raita","Pyaaz Ka Raita","Beet Root Raita","Anardana Raita","Caesar Salad","Cucumber Raita","Watermelon Raita","Potato Raita"};
        price5=new int[]{40,50,45,80,75,65,80,60,55};

        sa1 = (TextView) rootView.findViewById(R.id.sa1);
        sa2 = (TextView) rootView.findViewById(R.id.sa2);
        sa3 = (TextView) rootView.findViewById(R.id.sa3);
        sa4 = (TextView) rootView.findViewById(R.id.sa4);
        sa5 = (TextView) rootView.findViewById(R.id.sa5);
        sa6 = (TextView) rootView.findViewById(R.id.sa6);
        sa7 = (TextView) rootView.findViewById(R.id.sa7);
        sa8 = (TextView) rootView.findViewById(R.id.sa8);
        sa9 = (TextView) rootView.findViewById(R.id.sa9);

        binc51 = (Button) rootView.findViewById(R.id.binc51);
        binc52 = (Button) rootView.findViewById(R.id.binc52);
        binc53 = (Button) rootView.findViewById(R.id.binc53);
        binc54 = (Button) rootView.findViewById(R.id.binc54);
        binc55 = (Button) rootView.findViewById(R.id.binc55);
        binc56 = (Button) rootView.findViewById(R.id.binc56);
        binc57 = (Button) rootView.findViewById(R.id.binc57);
        binc58 = (Button) rootView.findViewById(R.id.binc58);
        binc59 = (Button) rootView.findViewById(R.id.binc59);

        bdec51 = (Button) rootView.findViewById(R.id.bdec51);
        bdec52 = (Button) rootView.findViewById(R.id.bdec52);
        bdec53 = (Button) rootView.findViewById(R.id.bdec53);
        bdec54 = (Button) rootView.findViewById(R.id.bdec54);
        bdec55 = (Button) rootView.findViewById(R.id.bdec55);
        bdec56 = (Button) rootView.findViewById(R.id.bdec56);
        bdec57 = (Button) rootView.findViewById(R.id.bdec57);
        bdec58 = (Button) rootView.findViewById(R.id.bdec58);
        bdec59 = (Button) rootView.findViewById(R.id.bdec59);

        cnt5 = new int[9];
      /*  binc51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int qty = Integer.parseInt((String) sa1.getText());
                    qty++;
                    sa1.setText(qty+ "");
                   *//* Log.e("qty",""+p1.getText().toString());*//*
                }
                catch (Exception e)
                {
                    sa1.setText("Enter valid number");
                }
            }
        });
        binc52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) sa2.getText());
                    iqty11++;
                    sa2.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    sa2.setText("Enter valid number");
                }
            }
        });
        binc53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) sa3.getText());
                    iqty11++;
                    sa3.setText(iqty11 + "");
                   *//* Log.e("iqty13",""+""+p3.getText().toString());*//*
                }
                catch (Exception e)
                {
                    sa3.setText("Enter valid number");
                }
            }
        });
        binc54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) sa4.getText());
                    iqty11++;
                    sa4.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    sa4.setText("Enter valid number");
                }
            }
        });
        binc55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) sa5.getText());
                    iqty11++;
                    sa5.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    sa5.setText("Enter valid number");
                }
            }
        });
        binc56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) sa6.getText());
                    iqty11++;
                    sa6.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    sa6.setText("Enter valid number");
                }
            }
        });
        binc57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) sa7.getText());
                    iqty11++;
                    sa7.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    sa7.setText("Enter valid number");
                }
            }
        });
        binc58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) sa8.getText());
                    iqty11++;
                    sa8.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    sa8.setText("Enter valid number");
                }
            }
        });
        binc59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int iqty11 = Integer.parseInt((String) sa9.getText());
                    iqty11++;
                    sa9.setText(iqty11 + "");
                }
                catch (Exception e)
                {
                    sa9.setText("Enter valid number");
                }
            }
        });


        bdec51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) sa1.getText());
                    if (dqty11 == 0)
                        sa1.setText(""+0);
                    else {
                        dqty11--;
                        sa1.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    sa1.setText("Enter valid number");
                }
            }
        });
        bdec52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) sa2.getText());
                    if (dqty11 == 0)
                        sa2.setText(""+0);
                    else {
                        dqty11--;
                        sa2.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    sa2.setText("Enter valid number");
                }
            }
        });
        bdec53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) sa3.getText());
                    if (dqty11 == 0)
                        sa3.setText(""+0);
                    else {
                        dqty11--;
                        sa3.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    sa3.setText("Enter valid number");
                }
            }
        });
        bdec54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) sa4.getText());
                    if (dqty11 == 0)
                        sa4.setText(""+0);
                    else {
                        dqty11--;
                        sa4.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    sa4.setText("Enter valid number");
                }
            }
        });
        bdec55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) sa5.getText());
                    if (dqty11 == 0)
                        sa5.setText(""+0);
                    else {
                        dqty11--;
                        sa5.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    sa5.setText("Enter valid number");
                }
            }
        });
        bdec56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) sa6.getText());
                    if (dqty11 == 0)
                        sa6.setText(""+0);
                    else {
                        dqty11--;
                        sa6.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    sa6.setText("Enter valid number");
                }
            }
        });
        bdec57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) sa7.getText());
                    if (dqty11 == 0)
                        sa7.setText(""+0);
                    else {
                        dqty11--;
                        sa7.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    sa7.setText("Enter valid number");
                }
            }
        });
        bdec58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) sa8.getText());
                    if (dqty11 == 0)
                        sa8.setText(""+0);
                    else {
                        dqty11--;
                        sa8.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    sa8.setText("Enter valid number");
                }
            }
        });
        bdec59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) sa9.getText());
                    if (dqty11 == 0)
                        sa9.setText(""+0);
                    else {
                        dqty11--;
                        sa9.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    sa9.setText("Enter valid number");
                }
            }
        });
*/
        binc51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg5=1;
                    int qty = Integer.parseInt((String) sa1.getText());
                    qty++;
                    ForTabData.cnt5[0]=qty;
                    sa1.setText(ForTabData.cnt5[0]+ "");
                   /* Log.e("qty",""+p1.getText().toString());*/
                }
                catch (Exception e)
                {
                    sa1.setText("Enter valid number");
                }
            }
        });
        binc52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg5=1;
                    int iqty11 = Integer.parseInt((String) sa2.getText());
                    iqty11++;
                    ForTabData.cnt5[1]=iqty11;
                    sa2.setText(ForTabData.cnt5[1]+ "");
                }
                catch (Exception e)
                {
                    sa2.setText("Enter valid number");
                }
            }
        });
        binc53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg5=1;
                    int iqty11 = Integer.parseInt((String) sa3.getText());
                    iqty11++;
                    ForTabData.cnt5[2]=iqty11;
                    sa3.setText(ForTabData.cnt5[2]+ "");
                   /* Log.e("iqty13",""+""+p3.getText().toString());*/
                }
                catch (Exception e)
                {
                    sa3.setText("Enter valid number");
                }
            }
        });
        binc54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg5=1;
                    int iqty11 = Integer.parseInt((String) sa4.getText());
                    iqty11++;
                    ForTabData.cnt5[3]=iqty11;
                    sa4.setText(ForTabData.cnt5[3]+ "");
                }
                catch (Exception e)
                {
                    sa4.setText("Enter valid number");
                }
            }
        });
        binc55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg5=1;
                    int iqty11 = Integer.parseInt((String) sa5.getText());
                    iqty11++;
                    ForTabData.cnt5[4]=iqty11;

                    sa5.setText(ForTabData.cnt5[4]+ "");
                }
                catch (Exception e)
                {
                    sa5.setText("Enter valid number");
                }
            }
        });
        binc56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg2=1;
                    int iqty11 = Integer.parseInt((String) sa6.getText());
                    iqty11++;
                    ForTabData.cnt5[5]=iqty11;
                    sa6.setText(ForTabData.cnt5[5]+ "");
                }
                catch (Exception e)
                {
                    sa6.setText("Enter valid number");
                }
            }
        });
        binc57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg5=1;
                    int iqty11 = Integer.parseInt((String) sa7.getText());
                    iqty11++;
                    ForTabData.cnt5[6]=iqty11;
                    sa7.setText(ForTabData.cnt5[6]+ "");
                }
                catch (Exception e)
                {
                    sa7.setText("Enter valid number");
                }
            }
        });
        binc58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg5=1;
                    int iqty11 = Integer.parseInt((String) sa8.getText());
                    iqty11++;
                    ForTabData.cnt5[7]=iqty11;
                    sa8.setText(ForTabData.cnt5[7]+ "");
                }
                catch (Exception e)
                {
                    sa8.setText("Enter valid number");
                }
            }
        });
        binc59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg5=1;
                    int iqty11 = Integer.parseInt((String) sa9.getText());
                    iqty11++;
                    ForTabData.cnt5[8]=iqty11;
                    sa9.setText(ForTabData.cnt5[8]+ "");
                }
                catch (Exception e)
                {
                    sa9.setText("Enter valid number");
                }
            }
        });

        bdec51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[0] == 0)
                        sa1.setText(""+0);
                    else {
                        ForTabData.cnt5[0]--;
                        sa1.setText(""+ForTabData.cnt5[0] );
                    }
                }catch (Exception e)
                {
                    sa1.setText("Enter valid number");
                }
            }
        });
        bdec52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    // int dqty11 = Integer.parseInt((String) p2.getText());
                    if (ForTabData.cnt5[1]== 0)
                        sa2.setText(""+0);
                    else {
                        ForTabData.cnt5[1]--;
                        sa2.setText(""+ForTabData.cnt5[1]);
                    }
                }catch (Exception e)
                {
                    sa2.setText("Enter valid number");
                }
            }
        });
        bdec53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[2] == 0)
                        sa3.setText(""+0);
                    else {
                        ForTabData.cnt5[2]--;
                        sa3.setText(""+ForTabData.cnt5[2] );
                    }
                }catch (Exception e)
                {
                    sa3.setText("Enter valid number");
                }
            }
        });
        bdec54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[3] == 0)
                        sa4.setText(""+0);
                    else {
                        ForTabData.cnt5[3]--;
                        sa4.setText(""+ForTabData.cnt5[3] );
                    }
                }catch (Exception e)
                {
                    sa4.setText("Enter valid number");
                }
            }
        });
        bdec55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[4] == 0)
                        sa5.setText(""+0);
                    else {
                        ForTabData.cnt5[4]--;
                        sa5.setText(""+ForTabData.cnt5[4] );
                    }
                }catch (Exception e)
                {
                    sa5.setText("Enter valid number");
                }
            }
        });
        bdec56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[5] == 0)
                        sa6.setText(""+0);
                    else {
                        ForTabData.cnt5[5]--;
                        sa6.setText(""+ForTabData.cnt5[5] );
                    }
                }catch (Exception e)
                {
                    sa6.setText("Enter valid number");
                }
            }
        });
        bdec57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[6] == 0)
                        sa7.setText(""+0);
                    else {
                        ForTabData.cnt5[6]--;
                        sa7.setText(""+ForTabData.cnt5[6] );
                    }
                }catch (Exception e)
                {
                    sa7.setText("Enter valid number");
                }
            }
        });
        bdec58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[7] == 0)
                        sa8.setText(""+0);
                    else {
                        ForTabData.cnt5[7]--;
                        sa8.setText(""+ForTabData.cnt5[7] );
                    }
                }catch (Exception e)
                {
                    sa8.setText("Enter valid number");
                }
            }
        });
        bdec59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[8] == 0)
                        sa9.setText(""+0);
                    else {
                        ForTabData.cnt5[0]--;
                        sa9.setText(""+ForTabData.cnt5[8] );
                    }
                }catch (Exception e)
                {
                    sa9.setText("Enter valid number");
                }
            }
        });

        return rootView;
    }
}
