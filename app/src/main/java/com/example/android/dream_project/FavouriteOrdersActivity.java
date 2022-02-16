package com.example.android.dream_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.widget.GridLayout;

import java.util.ArrayList;

public class FavouriteOrdersActivity extends AppCompatActivity {

    GridLayout card_view;
    ArrayList<FavouriteOrdersModel> favouriteOrdersModelArrayList = new ArrayList<FavouriteOrdersModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_orders);

        card_view = (GridLayout) findViewById(R.id.card_view);

        GridLayoutManager llm = new GridLayoutManager(this,2);

        favouriteOrdersModelArrayList.add(new FavouriteOrdersModel(R.drawable.cake,"Cake","31 Mins - 2 Stores"));
        favouriteOrdersModelArrayList.add(new FavouriteOrdersModel(R.drawable.cake,"Cake","31 Mins - 2 Stores"));
        favouriteOrdersModelArrayList.add(new FavouriteOrdersModel(R.drawable.cake,"Cake","31 Mins - 2 Stores"));
        favouriteOrdersModelArrayList.add(new FavouriteOrdersModel(R.drawable.cake,"Cake","31 Mins - 2 Stores"));
        favouriteOrdersModelArrayList.add(new FavouriteOrdersModel(R.drawable.cake,"Cake","31 Mins - 2 Stores"));
        favouriteOrdersModelArrayList.add(new FavouriteOrdersModel(R.drawable.cake,"Cake","31 Mins - 2 Stores"));
        favouriteOrdersModelArrayList.add(new FavouriteOrdersModel(R.drawable.cake,"Cake","31 Mins - 2 Stores"));
        favouriteOrdersModelArrayList.add(new FavouriteOrdersModel(R.drawable.cake,"Cake","31 Mins - 2 Stores"));
        favouriteOrdersModelArrayList.add(new FavouriteOrdersModel(R.drawable.cake,"Cake","31 Mins - 2 Stores"));
        favouriteOrdersModelArrayList.add(new FavouriteOrdersModel(R.drawable.cake,"Cake","31 Mins - 2 Stores"));


        FavouriteOrdersAdapter adapter = new FavouriteOrdersAdapter( this,favouriteOrdersModelArrayList);
        
    }
}