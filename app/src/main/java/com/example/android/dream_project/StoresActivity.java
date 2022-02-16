package com.example.android.dream_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class StoresActivity extends AppCompatActivity {

    RecyclerView nears_rec;
    ArrayList<HomeModel> homemodelArrayList = new ArrayList<HomeModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stores);

        nears_rec = findViewById(R.id.nears_rec);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        nears_rec.setLayoutManager(lm);

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

        HomeAdapter adapter = new HomeAdapter(this, homemodelArrayList);
        nears_rec.setAdapter(adapter);
    }
}