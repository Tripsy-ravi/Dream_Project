package com.example.android.dream_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class OrdersActivity extends AppCompatActivity implements OrderAdapter.onNoteListener{

    RecyclerView recvieword;
    Spinner select;
    ArrayList<OrderModel> ordermodelArrayList = new ArrayList<OrderModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        recvieword = (RecyclerView) findViewById(R.id.recvieword);

        select=findViewById(R.id.select);
        ArrayAdapter<String> myadapter=new ArrayAdapter<String>(OrdersActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.itemselect));
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        select.setAdapter(myadapter);





        LinearLayoutManager llm = new LinearLayoutManager(this);
        recvieword.setLayoutManager(llm);

        ordermodelArrayList.add(new OrderModel(R.drawable.ic_baseline_restaurant_24,"7th Heaven",
                "ordered on 24 Jan 2022, 09:57 AM","8 items |","₹350","Delivered"));
        ordermodelArrayList.add(new OrderModel(R.drawable.ic_baseline_restaurant_24,"7th Heaven",
                "ordered on 24 Jan 2022, 09:57 AM","8 items |","₹350","Delivered"));
        ordermodelArrayList.add(new OrderModel(R.drawable.ic_baseline_restaurant_24,"7th Heaven",
                "ordered on 24 Jan 2022, 09:57 AM","8 items |","₹350","Delivered"));
        ordermodelArrayList.add(new OrderModel(R.drawable.ic_baseline_restaurant_24,"7th Heaven",
                "ordered on 24 Jan 2022, 09:57 AM","8 items |","₹350","Delivered"));

        OrderAdapter adapter=new OrderAdapter(this, ordermodelArrayList,this::onNoteClick);
        recvieword.setAdapter(adapter);
    }

    @Override
    public void onNoteClick(int position) {
        Intent intent = new Intent(OrdersActivity.this,OrderDetailsActivity.class);
        startActivity(intent);
    }
}