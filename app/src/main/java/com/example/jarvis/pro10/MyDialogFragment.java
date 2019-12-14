package com.example.jarvis.pro10;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

import static android.app.PendingIntent.getActivity;
import static android.support.v4.content.ContextCompat.startActivity;
import static com.example.jarvis.pro10.Home.s;

/**
 * Created by it on 4/17/2017.
 */

public class MyDialogFragment extends DialogFragment {
    public MyDialogFragment() {
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {



        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Bill");
        builder.setMessage(Home.s);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // You don't have to do anything here if you just want it dismissed when clicked
/*
                onDismiss();
*/
             /*for(int i=0;i<9;i++)
             {
                 ForTabData.cnt1[i]=0;
                 ForTabData.cnt2[i]=0;
                 ForTabData.cnt3[i]=0;
                 ForTabData.cnt4[i]=0;
                 ForTabData.cnt5[i]=0;

             }*/
            }
        });

        // Create the AlertDialog object and return it
        return builder.create();
    }

   /* public void onDismiss()
    {
        super.dismiss();
        getActivity().finish();
        Intent i=new Intent(getActivity(),MainActivity.class);
        startActivity(i);
    }*/

}
