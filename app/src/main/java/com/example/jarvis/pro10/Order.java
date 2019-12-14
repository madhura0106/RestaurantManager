package com.example.jarvis.pro10;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.ValueEventListener;

import static com.example.jarvis.pro10.Home.s;

public class Order extends Fragment {
    private View rootView;
    private Context context;
    private Activity activity;
    /*private EditText txtOrder;*/
    private Button btnPlace;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_order, container, false);
        activity = getActivity();
        context = activity.getApplicationContext();
/*
        setListeners();
*/
        orderNow();
        return rootView;
    }

    /*private void setListeners(){
       *//* txtOrder = (EditText)rootView.findViewById(R.id.txtOrder);*//*
       *//* btnPlace = (Button)rootView.findViewById(R.id.btnPlace);
        btnPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConnected()) {
                    placeOrder();
                }else
                    Snackbar.make(activity.findViewById(R.id.main_content), "Please check the data connection !", Snackbar.LENGTH_LONG).show();
            }
        });*//*
       Button
    }*/
       public void orderNow()
        {
           if(isConnected())
               placeOrder();
            else
               Snackbar.make(activity.findViewById(R.id.main_content), "Please check the data connection !", Snackbar.LENGTH_LONG).show();

        }

    private void placeOrder(){
        final ProgressDialog pd = new ProgressDialog(activity);
        pd.setCancelable(true);
        pd.setMessage("Placing Order...");
        pd.show();
        final String menu =Home.s;/* txtOrder.getText().toString();*/

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference();
        myRef.child("orderNo").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                final int no = Integer.parseInt(dataSnapshot.getValue().toString());
                myRef.child("orderNo").setValue((no+1)).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            myRef.child("orders").child(""+no).setValue(menu).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    pd.dismiss();
                                    Toast.makeText(activity, "Order Placed !", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                        else {
                            pd.dismiss();
                            Toast.makeText(activity, "Failed !", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {}
        });
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
