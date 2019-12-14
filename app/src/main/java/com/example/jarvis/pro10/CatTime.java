package com.example.jarvis.pro10;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.TimePicker;

/**
 * Created by mane on 5/14/2017.
 */

public class CatTime extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    static String time;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current time as the default values for the picker
        final java.util.Calendar c= java.util.Calendar.getInstance();
        int hour=c.get(java.util.Calendar.HOUR_OF_DAY);
        int minute=c.get(java.util.Calendar.MINUTE);


        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        time=""+hourOfDay+":"+minute;
       // Log.e("Time:",time);
    }
}
