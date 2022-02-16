package com.example.android.dream_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    RecyclerView category_rec,near_rec;
    ArrayList<HomeModel> homemodelArrayList = new ArrayList<HomeModel>();
    ArrayList<CategoryModel> categoryModelArrayList = new ArrayList<CategoryModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        category_rec = findViewById(R.id.category_rec);
        near_rec = findViewById(R.id.near_rec);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        category_rec.setLayoutManager(llm);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        near_rec.setLayoutManager(lm);

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

        CategoryAdapter cadapter = new CategoryAdapter(this, categoryModelArrayList);
        category_rec.setAdapter(cadapter);

        HomeAdapter adapter = new HomeAdapter(this, homemodelArrayList);
        near_rec.setAdapter(adapter);
    }
}