package com.example.android.dream_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

public class ShopActivity extends AppCompatActivity {

    RecyclerView recvieword;
    ArrayList<ShopModel> shopmodelArrayList = new ArrayList<ShopModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        recvieword = findViewById(R.id.shop_rec);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        recvieword.setLayoutManager(llm);

        shopmodelArrayList.add(new ShopModel(R.drawable.ic_baseline_restaurant_24,"Bread",
                "Berief description Lorem Ipsum is simply dummy text of the printing and ... More ","₹350"));

        shopmodelArrayList.add(new ShopModel(R.drawable.ic_baseline_restaurant_24,"Bread",
                "Berief description Lorem Ipsum is simply dummy text of the printing and ... More ","₹350"));

        shopmodelArrayList.add(new ShopModel(R.drawable.ic_baseline_restaurant_24,"Bread",
                "Berief description Lorem Ipsum is simply dummy text of the printing and ... More ","₹350"));

        shopmodelArrayList.add(new ShopModel(R.drawable.ic_baseline_restaurant_24,"Bread",
                "Berief description Lorem Ipsum is simply dummy text of the printing and ... More ","₹350"));

        shopmodelArrayList.add(new ShopModel(R.drawable.ic_baseline_restaurant_24,"Bread",
                "Berief description Lorem Ipsum is simply dummy text of the printing and ... More ","₹350"));

        ShopAdapter adapter=new ShopAdapter( this,shopmodelArrayList);
        recvieword.setAdapter(adapter);
    }
}