package com.example.android.dream_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class StoreActivity extends AppCompatActivity {

    RecyclerView nearss_pop,nearss_cat,nearss_shop;
    ArrayList<CategoryModel> categoryModelArrayList = new ArrayList<CategoryModel>();
    ArrayList<HomeModel> homemodelArrayList = new ArrayList<HomeModel>();
    ArrayList<PopularModel> popularmodelArrayList = new ArrayList<PopularModel>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        nearss_cat = findViewById(R.id.nearss_cat);
        nearss_shop = findViewById(R.id.nearss_shop);
        nearss_pop = findViewById(R.id.nearss_pop);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        nearss_cat.setLayoutManager(llm);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        nearss_shop.setLayoutManager(lm);

        LinearLayoutManager lllm = new LinearLayoutManager(this);
        nearss_pop.setLayoutManager(lllm);

        homemodelArrayList.add(new HomeModel(R.drawable.cake,"Haldiram","Police colony more, anishabad",
                "40 mins | 2 km","4.1"));
        homemodelArrayList.add(new HomeModel(R.drawable.cake,"Haldiram","Police colony more, anishabad",
                "40 mins | 2 km","4.1"));
        homemodelArrayList.add(new HomeModel(R.drawable.cake,"Haldiram","Police colony more, anishabad",
                "40 mins | 2 km","4.1"));
        homemodelArrayList.add(new HomeModel(R.drawable.cake,"Haldiram","Police colony more, anishabad",
                "40 mins | 2 km","4.1"));
        homemodelArrayList.add(new HomeModel(R.drawable.cake,"Haldiram","Police colony more, anishabad",
                "40 mins | 2 km","4.1"));

        categoryModelArrayList.add(new CategoryModel(R.drawable.cake,"Home Essentials"));
        categoryModelArrayList.add(new CategoryModel(R.drawable.cake,"Home Essentials"));
        categoryModelArrayList.add(new CategoryModel(R.drawable.cake,"Home Essentials"));
        categoryModelArrayList.add(new CategoryModel(R.drawable.cake,"Home Essentials"));
        categoryModelArrayList.add(new CategoryModel(R.drawable.cake,"Home Essentials"));

        popularmodelArrayList.add(new PopularModel(R.drawable.cake,"Home Essentials"));
        popularmodelArrayList.add(new PopularModel(R.drawable.cake,"Home Essentials"));
        popularmodelArrayList.add(new PopularModel(R.drawable.cake,"Home Essentials"));
        popularmodelArrayList.add(new PopularModel(R.drawable.cake,"Home Essentials"));

        PopularAdapter cadapter = new PopularAdapter(this, popularmodelArrayList);
        nearss_cat.setAdapter(cadapter);

        CategoryAdapter ccadapter = new CategoryAdapter(this, categoryModelArrayList);
        nearss_pop.setAdapter(ccadapter);

        HomeAdapter adapter = new HomeAdapter(this, homemodelArrayList);
        nearss_shop.setAdapter(adapter);
    }
}