package com.example.android.dream_project;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    Context context;
    ArrayList<HomeModel> homeModelArrayList = new ArrayList<HomeModel>();

    public HomeAdapter(Context context, ArrayList<HomeModel> homeModelArrayList) {
        this.context = context;
        this.homeModelArrayList = homeModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_shops_nearby,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        HomeModel homeModell = homeModelArrayList.get(position);
        if(holder != null ){

            if(homeModell != null){

                holder.near_img.setImageResource(homeModell.getNear_img());
                holder.near_title.setText(homeModell.getNear_title());
                holder.near_loc.setText(homeModell.getNear_loc());
                holder.near_tym.setText(homeModell.getNear_tym());
                holder.near_rate.setText(homeModell.getNear_rate());

            }else
                Log.e(getClass().getSimpleName(),"model object is Null...");
        }else
            Log.e(getClass().getSimpleName(), "holder object is null...");

    }

    @Override
    public int getItemCount() {
        return homeModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView near_img;
        TextView near_title,near_loc,near_tym,near_rate;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            near_img = itemView.findViewById(R.id.near_img);
            near_title = itemView.findViewById(R.id.near_title);
            near_loc = itemView.findViewById(R.id.near_loc);
            near_tym = itemView.findViewById(R.id.near_tym);
            near_rate = itemView.findViewById(R.id.near_rate);
        }
    }
}
