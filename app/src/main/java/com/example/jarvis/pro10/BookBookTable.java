package com.example.jarvis.pro10;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class BookBookTable extends Fragment {
    private View rootView;
    private Context context;
    private Activity activity;
    private SwipeRefreshLayout moistureSwipe;
    private ArrayList<String> orders;
    private ListView tabllstOrder;
    private ArrayAdapter adapter;
    static int maxNo = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_book_book_table, container, false);
        activity = getActivity();
        context = activity.getApplicationContext();
        tabllstOrder = (ListView) rootView.findViewById(R.id.tabllstOrder);
        moistureSwipe = (SwipeRefreshLayout) rootView.findViewById(R.id.orderSwipe);
        moistureSwipe.setColorSchemeColors(getResources().getColor(R.color.colorPrimaryDark));
        moistureSwipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if(Home.isConnected())
                    loadOrders();
                else
                    Snackbar.make(activity.findViewById(R.id.main_content), "Please check the data connection !", Snackbar.LENGTH_LONG).show();
                moistureSwipe.setRefreshing(false);

            }
        });
        try {
            tabllstOrder.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                    final AlertDialog ad = new AlertDialog.Builder(activity).create();
                    ad.setMessage("Do you want to remove this order?");
                    ad.setButton(AlertDialog.BUTTON_NEGATIVE, "No", (DialogInterface.OnClickListener) null);
                    ad.setButton(AlertDialog.BUTTON_POSITIVE, "Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            String key = tabllstOrder.getItemAtPosition(position).toString().split(":")[0];
                            key = key.substring(0, key.length() - 1);
                            final DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
                            mDatabase.child("Table Bookings").child(key).removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        mDatabase.child("Table Bookings").addValueEventListener(new ValueEventListener() {
                                            @Override
                                            public void onDataChange(DataSnapshot dataSnapshot) {
                                                maxNo = 0;
                                                for (DataSnapshot order : dataSnapshot.getChildren()) {
                                                    if (maxNo < Integer.parseInt(order.getKey()))
                                                        maxNo = Integer.parseInt(order.getKey());
                                                }
                                                mDatabase.child("orderNo").setValue((maxNo + 1)).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful()) {
                                                            Toast.makeText(activity, "Booking Removed !", Toast.LENGTH_SHORT).show();
                                                            loadOrders();
                                                        }
                                                    }
                                                });
                                            }

                                            @Override
                                            public void onCancelled(DatabaseError databaseError) {
                                            }
                                        });
                                    }
                                }
                            });
                        }
                    });
                    ad.show();
                }
            });
        }catch(Exception e){
            Log.e("Exception",""+e);}

        return rootView;
    }

    private void loadOrders() {
        //code for reading from firebase
        final ProgressDialog pd = new ProgressDialog(activity);
        pd.setCancelable(true);
        pd.setMessage("Loading Bookings...");
        pd.show();
        orders = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(activity,android.R.layout.simple_list_item_1,orders);
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("Table Bookings").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                orders.clear();
                for (DataSnapshot order : dataSnapshot.getChildren()) {
                    orders.add(order.getKey()+" : "+order.getValue());
                    if(maxNo<Integer.parseInt(order.getKey()))
                        maxNo=Integer.parseInt(order.getKey());
                }
                try {
                    tabllstOrder.setAdapter(adapter);
                }catch (Exception e){}
                    adapter.notifyDataSetChanged();
                pd.dismiss();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {}
        });
    }
}
