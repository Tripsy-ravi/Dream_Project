package com.example.android.dream_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FavouriteOrdersAdapter extends RecyclerView.Adapter<FavouriteOrdersAdapter.ViewHolder> {

    Context context;
    ArrayList<FavouriteOrdersModel> favouriteOrdersModelArrayList = new ArrayList<>();

    public FavouriteOrdersAdapter(Context context, ArrayList<FavouriteOrdersModel> favouriteOrdersModelArrayList) {
        this.context = context;
        this.favouriteOrdersModelArrayList = favouriteOrdersModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_favouriteorders,parent,false);
        return new FavouriteOrdersAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        FavouriteOrdersModel favouriteOrdersModel = favouriteOrdersModelArrayList.get(position);
        holder.fav_img.setImageResource(favouriteOrdersModel.getFav_img());
        holder.fav_item.setText(favouriteOrdersModel.getFav_item());
        holder.fav_time.setText(favouriteOrdersModel.getFav_time());
    }

    @Override
    public int getItemCount() {
        return favouriteOrdersModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView fav_img;
        TextView fav_item,fav_time;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fav_img = itemView.findViewById(R.id.fav_img);
            fav_item = itemView.findViewById(R.id.fav_item);
            fav_time = itemView.findViewById(R.id.fav_time);
        }
    }
}
