package com.example.jarvis.pro10;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import java.util.Calendar;

/**
 * Created by Pranav on 14-05-2017.
 */

public class TablDate extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    static String date;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);



        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        int mon=month+1;
        date=""+dayOfMonth+"/"+mon+"/"+year;
        //      Log.e("Date:",date);
//        Toast.makeText(getActivity(),"previous"+date,Toast.LENGTH_SHORT).show();
    }
}