package com.example.jarvis.pro10;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Tab1PanjabiFood extends Fragment{
    static String[] menu1;
    static int[] price1;
    static int[] cnt1;
    static TextView p1;
    static TextView p2;
    static TextView p3;
    static TextView p4;
    static TextView p5;
    static TextView p6;
    static TextView p7;
    static TextView p8;
    static TextView p9;
    static TextView p10;
    ViewPager pager;
    Button binc11;
    Button binc12;
    Button binc13;
    Button binc14;
    Button binc15;
    Button binc16;
    Button binc17;
    Button binc18;
    Button binc19;
    Button binc110;

    Button bdec11;
    Button bdec12;
    Button bdec13;
    Button bdec14;
    Button bdec15;
    Button bdec16;
    Button bdec17;
    Button bdec18;
    Button bdec19;
    Button bdec110;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1panjabifood, container, false);
        menu1 = new String[]{"Chicken Butter", "Chole Bhature", "Dhaba Dal", "Jeera Rice", "Masala Chana", "Mooli Paratha", "Murgh Malaiwala", "Naan", "Pakoda Kadhi", "Dal Makhani"};
        price1 = new int[]{200, 110, 100, 80, 120, 70, 180, 30, 50, 110};
        p1 = (TextView) rootView.findViewById(R.id.p1);
        p2 = (TextView) rootView.findViewById(R.id.p2);
        p3 = (TextView) rootView.findViewById(R.id.p3);
        p4 = (TextView) rootView.findViewById(R.id.p4);
        p5 = (TextView) rootView.findViewById(R.id.p5);
        p6 = (TextView) rootView.findViewById(R.id.p6);
        p7 = (TextView) rootView.findViewById(R.id.p7);
        p8 = (TextView) rootView.findViewById(R.id.p8);
        p9 = (TextView) rootView.findViewById(R.id.p9);
        p10 = (TextView) rootView.findViewById(R.id.p10);
        pager=(ViewPager) rootView.findViewById(R.id.pager);
        cnt1 = new int[9];

        if(ForTabData.flg1>0) {
            p1.setText(new Integer(ForTabData.cnt1[0]).toString());
            p2.setText(new Integer(ForTabData.cnt1[1]).toString());
            p3.setText(new Integer(ForTabData.cnt1[2]).toString());
            p4.setText(new Integer(ForTabData.cnt1[3]).toString());
            p5.setText(new Integer(ForTabData.cnt1[4]).toString());
            p6.setText(new Integer(ForTabData.cnt1[5]).toString());
            p7.setText(new Integer(ForTabData.cnt1[6]).toString());
            p8.setText(new Integer(ForTabData.cnt1[7]).toString());
            p9.setText(new Integer(ForTabData.cnt1[8]).toString());
            p10.setText(new Integer(ForTabData.cnt1[9]).toString());
        }
        binc11 = (Button) rootView.findViewById(R.id.binc11);



        binc12 = (Button) rootView.findViewById(R.id.binc12);
        binc13 = (Button) rootView.findViewById(R.id.binc13);
        binc14 = (Button) rootView.findViewById(R.id.binc14);
        binc15 = (Button) rootView.findViewById(R.id.binc15);
        binc16 = (Button) rootView.findViewById(R.id.binc16);
        binc17 = (Button) rootView.findViewById(R.id.binc17);
        binc18 = (Button) rootView.findViewById(R.id.binc18);
        binc19 = (Button) rootView.findViewById(R.id.binc19);
        binc110 = (Button) rootView.findViewById(R.id.binc110);

        bdec11 = (Button) rootView.findViewById(R.id.bdec11);
        bdec12 = (Button) rootView.findViewById(R.id.bdec12);
        bdec13 = (Button) rootView.findViewById(R.id.bdec13);
        bdec14 = (Button) rootView.findViewById(R.id.bdec14);
        bdec15 = (Button) rootView.findViewById(R.id.bdec15);
        bdec16 = (Button) rootView.findViewById(R.id.bdec16);
        bdec17 = (Button) rootView.findViewById(R.id.bdec17);
        bdec18 = (Button) rootView.findViewById(R.id.bdec18);
        bdec19 = (Button) rootView.findViewById(R.id.bdec19);
        bdec110 = (Button) rootView.findViewById(R.id.bdec110);


        binc11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg1=1;
                    int iqty = Integer.parseInt((String) p1.getText());
                    iqty++;
                    ForTabData.cnt1[0]=iqty;
                    p1.setText(ForTabData.cnt1[0]+ "");
                   /* Log.e("qty",""+p1.getText().toString());*/
                }
                catch (Exception e)
                {
                    p1.setText("Enter valid number");
                }
            }
        });
        binc12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg1=1;
                    int iqty11 = Integer.parseInt((String) p2.getText());
                    iqty11++;
                    ForTabData.cnt1[1]=iqty11;
                    p2.setText(ForTabData.cnt1[1]+ "");
                }
                catch (Exception e)
                {
                    p2.setText("Enter valid number");
                }
            }
        });
        binc13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg1=1;
                    int iqty11 = Integer.parseInt((String) p3.getText());
                    iqty11++;
                    ForTabData.cnt1[2]=iqty11;
                    p3.setText(ForTabData.cnt1[2]+ "");
                   /* Log.e("iqty13",""+""+p3.getText().toString());*/
                }
                catch (Exception e)
                {
                    p3.setText("Enter valid number");
                }
            }
        });
        binc14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg1=1;
                    int iqty11 = Integer.parseInt((String) p4.getText());
                    iqty11++;
                    ForTabData.cnt1[3]=iqty11;
                    p4.setText(ForTabData.cnt1[3]+ "");
                }
                catch (Exception e)
                {
                    p4.setText("Enter valid number");
                }
            }
        });
        binc15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg1=1;
                    int iqty11 = Integer.parseInt((String) p5.getText());
                    iqty11++;
                    ForTabData.cnt1[4]=iqty11;

                    p5.setText(ForTabData.cnt1[4]+ "");
                }
                catch (Exception e)
                {
                    p5.setText("Enter valid number");
                }
            }
        });
        binc16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg1=1;
                    int iqty11 = Integer.parseInt((String) p6.getText());
                    iqty11++;
                    ForTabData.cnt1[5]=iqty11;
                    p6.setText(ForTabData.cnt1[5]+ "");
                }
                catch (Exception e)
                {
                    p6.setText("Enter valid number");
                }
            }
        });
        binc17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg1=1;
                    int iqty11 = Integer.parseInt((String) p7.getText());
                    iqty11++;
                    ForTabData.cnt1[6]=iqty11;
                    p7.setText(ForTabData.cnt1[6]+ "");
                }
                catch (Exception e)
                {
                    p7.setText("Enter valid number");
                }
            }
        });
        binc18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg1=1;
                    int iqty11 = Integer.parseInt((String) p8.getText());
                    iqty11++;
                    ForTabData.cnt1[7]=iqty11;
                    p8.setText(ForTabData.cnt1[7]+ "");
                }
                catch (Exception e)
                {
                    p8.setText("Enter valid number");
                }
            }
        });
        binc19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg1=1;
                    int iqty11 = Integer.parseInt((String) p9.getText());
                    iqty11++;
                    ForTabData.cnt1[8]=iqty11;
                    p9.setText(ForTabData.cnt1[8]+ "");
                }
                catch (Exception e)
                {
                    p9.setText("Enter valid number");
                }
            }
        });
        binc110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg1=1;
                    int iqty11 = Integer.parseInt((String) p10.getText());
                    iqty11++;
                    ForTabData.cnt1[9]=iqty11;
                    p10.setText(ForTabData.cnt1[9]+ "");
                }
                catch (Exception e)
                {
                    p10.setText("Enter valid number");
                }
            }
        });

        bdec11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[0] == 0)
                        p1.setText(""+0);
                    else {
                        ForTabData.cnt1[0]--;
                        p1.setText(""+ForTabData.cnt1[0] );
                    }
                }catch (Exception e)
                {
                    p1.setText("Enter valid number");
                }
            }
        });
        bdec12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    // int dqty11 = Integer.parseInt((String) p2.getText());
                    if (ForTabData.cnt1[1]== 0)
                        p2.setText(""+0);
                    else {
                        ForTabData.cnt1[1]--;
                        p2.setText(""+ForTabData.cnt1[1]);
                    }
                }catch (Exception e)
                {
                    p2.setText("Enter valid number");
                }
            }
        });
        bdec13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[2] == 0)
                        p3.setText(""+0);
                    else {
                        ForTabData.cnt1[2]--;
                        p3.setText(""+ForTabData.cnt1[2] );
                    }
                }catch (Exception e)
                {
                    p3.setText("Enter valid number");
                }
            }
        });
        bdec14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[3] == 0)
                        p4.setText(""+0);
                    else {
                        ForTabData.cnt1[3]--;
                        p4.setText(""+ForTabData.cnt1[3] );
                    }
                }catch (Exception e)
                {
                    p4.setText("Enter valid number");
                }
            }
        });
        bdec15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[4] == 0)
                        p5.setText(""+0);
                    else {
                        ForTabData.cnt1[4]--;
                        p5.setText(""+ForTabData.cnt1[4] );
                    }
                }catch (Exception e)
                {
                    p5.setText("Enter valid number");
                }
            }
        });
        bdec16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[5] == 0)
                        p6.setText(""+0);
                    else {
                        ForTabData.cnt1[5]--;
                        p6.setText(""+ForTabData.cnt1[5] );
                    }
                }catch (Exception e)
                {
                    p6.setText("Enter valid number");
                }
            }
        });
        bdec17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[6] == 0)
                        p7.setText(""+0);
                    else {
                        ForTabData.cnt1[6]--;
                        p7.setText(""+ForTabData.cnt1[6] );
                    }
                }catch (Exception e)
                {
                    p7.setText("Enter valid number");
                }
            }
        });
        bdec18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[7] == 0)
                        p8.setText(""+0);
                    else {
                        ForTabData.cnt1[7]--;
                        p8.setText(""+ForTabData.cnt1[7] );
                    }
                }catch (Exception e)
                {
                    p8.setText("Enter valid number");
                }
            }
        });
        bdec19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[8] == 0)
                        p9.setText(""+0);
                    else {
                        ForTabData.cnt1[0]--;
                        p9.setText(""+ForTabData.cnt1[8] );
                    }
                }catch (Exception e)
                {
                    p9.setText("Enter valid number");
                }
            }
        });
        bdec110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[9] == 0)
                        p10.setText(""+0);
                    else {
                        ForTabData.cnt1[9]--;
                        p10.setText(""+ForTabData.cnt1[9] );
                    }
                }catch (Exception e)
                {
                    p10.setText("Enter valid number");
                }
            }
        });

       /* bdec13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) p3.getText());
                    if (dqty11 == 0)
                        p3.setText(""+0);
                    else {
                        dqty11--;
                        p3.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    p3.setText("Enter valid number");
                }
            }
        });
        bdec14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) p4.getText());
                    if (dqty11 == 0)
                        p4.setText(""+0);
                    else {
                        dqty11--;
                        p4.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    p4.setText("Enter valid number");
                }
            }
        });
        bdec15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) p5.getText());
                    if (dqty11 == 0)
                        p5.setText(""+0);
                    else {
                        dqty11--;
                        p5.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    p5.setText("Enter valid number");
                }
            }
        });
        bdec16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) p6.getText());
                    if (dqty11 == 0)
                        p6.setText(""+0);
                    else {
                        dqty11--;
                        p6.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    p6.setText("Enter valid number");
                }
            }
        });
        bdec17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) p7.getText());
                    if (dqty11 == 0)
                        p7.setText(""+0);
                    else {
                        dqty11--;
                        p7.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    p7.setText("Enter valid number");
                }
            }
        });
        bdec18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) p8.getText());
                    if (dqty11 == 0)
                        p8.setText(""+0);
                    else {
                        dqty11--;
                        p8.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    p8.setText("Enter valid number");
                }
            }
        });
        bdec19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) p9.getText());
                    if (dqty11 == 0)
                        p9.setText(""+0);
                    else {
                        dqty11--;
                        p9.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    p9.setText("Enter valid number");
                }
            }
        });
        bdec110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    int dqty11 = Integer.parseInt((String) p10.getText());
                    if (dqty11 == 0)
                        p10.setText(""+0);
                    else {
                        dqty11--;
                        p10.setText(""+dqty11);
                    }
                }catch (Exception e)
                {
                    p10.setText("Enter valid number");
                }
            }
        });*/
        setRetainInstance(true);
      /*  ViewPager mViewPager = (ViewPager) pager.findViewById(R.id.pager);
        mViewPager.setOffscreenPageLimit(5);*/
      /*  TabsPagerAdapter adapter = new TabsPagerAdapter(getSupportFragmentManager());

*//** the ViewPager requires a minimum of 1 as OffscreenPageLimit *//*
        int limit = (adapter.getCount() > 1 ? adapter.getCount() - 1 : 1);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(limit);
*/


        return rootView;
    }

       /* public void onClick(View v)
        {
            Log.e("hii","v = "+v.getId());
        switch (v.getId()) {
            case R.id.binc11:
                Log.e("hii","in binc11");
                int iqty11 = Integer.parseInt((String) p1.getText());
                iqty11++;
                p1.setText(iqty11);
                break;

            case R.id.binc12:
                int iqty12 = Integer.parseInt((String) p2.getText());
                iqty12++;
                p2.setText(iqty12);
                break;

            case R.id.binc13:
                int iqty13 = Integer.parseInt((String) p3.getText());
                iqty13++;
                p3.setText(iqty13);
                break;

            case R.id.binc14:
                int iqty14 = Integer.parseInt((String) p4.getText());
                iqty14++;
                p4.setText(iqty14);
                break;

            case R.id.binc15:
                int iqty15 = Integer.parseInt((String) p5.getText());
                iqty15++;
                p5.setText(iqty15);
                break;

            case R.id.binc16:
                int iqty16 = Integer.parseInt((String) p6.getText());
                iqty16++;
                p6.setText(iqty16);
                break;

            case R.id.binc17:
                int iqty17 = Integer.parseInt((String) p7.getText());
                iqty17++;
                p7.setText(iqty17);
                break;

            case R.id.binc18:
                int iqty18 = Integer.parseInt((String) p8.getText());
                iqty18++;
                p8.setText(iqty18);
                break;

            case R.id.binc19:
                int iqty19 = Integer.parseInt((String) p9.getText());
                iqty19++;
                p9.setText(iqty19);
                break;

            case R.id.binc110:
                int iqty110 = Integer.parseInt((String) p10.getText());
                iqty110++;
                p10.setText(iqty110);
                break;

            case R.id.bdec11:
                int dqty11 = Integer.parseInt((String) p1.getText());
                if (dqty11 == 0)
                    p1.setText(0);
                else {
                    dqty11--;
                    p1.setText(dqty11);
                }
                break;

            case R.id.bdec12:
                int dqty12 = Integer.parseInt((String) p2.getText());
                if (dqty12 == 0)
                    p2.setText(0);
                else {
                    dqty12--;
                    p2.setText(dqty12);
                }
                break;

            case R.id.bdec13:
                int dqty13 = Integer.parseInt((String) p3.getText());
                if (dqty13 == 0)
                    p3.setText(0);
                else {
                    dqty13--;
                    p3.setText(dqty13);
                }
                break;

            case R.id.bdec14:
                int dqty14 = Integer.parseInt((String) p4.getText());
                if (dqty14 == 0)
                    p4.setText(0);
                else {
                    dqty14--;
                    p4.setText(dqty14);
                }
                break;

            case R.id.bdec15:
                int dqty15 = Integer.parseInt((String) p5.getText());
                if (dqty15 == 0)
                    p5.setText(0);
                else {
                    dqty15--;
                    p5.setText(dqty15);
                }
                break;

            case R.id.bdec16:
                int dqty16 = Integer.parseInt((String) p6.getText());
                if (dqty16 == 0)
                    p6.setText(0);
                else {
                    dqty16--;
                    p6.setText(dqty16);
                }
                break;

            case R.id.bdec17:
                int dqty17 = Integer.parseInt((String) p7.getText());
                if (dqty17 == 0)
                    p7.setText(0);
                else {
                    dqty17--;
                    p7.setText(dqty17);
                }
                break;

            case R.id.bdec18:
                int dqty18 = Integer.parseInt((String) p8.getText());
                if (dqty18 == 0)
                    p8.setText(0);
                else {
                    dqty18--;
                    p8.setText(dqty18);
                }
                break;

            case R.id.bdec19:
                int dqty19 = Integer.parseInt((String) p9.getText());
                if (dqty19 == 0)
                    p9.setText(0);
                else {
                    dqty19--;
                    p9.setText(dqty19);
                }
                break;

            case R.id.bdec110:
                int dqty110 = Integer.parseInt((String) p10.getText());
                if (dqty110 == 0)
                    p10.setText(0);
                else {
                    dqty110--;
                    p10.setText(dqty110);
                }
                break;
        }
    }*/
}
