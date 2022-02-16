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

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {

    Context context;
    ArrayList<PopularModel> popularModelArrayList = new ArrayList<PopularModel>();

    public PopularAdapter(Context context, ArrayList<PopularModel> popularModelArrayList) {
        this.context = context;
        this.popularModelArrayList = popularModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_stores_popular,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        PopularModel popularModel = popularModelArrayList.get(position);
        holder.popular_img.setImageResource(popularModel.getCategory_img());
        holder.popular_txt.setText(popularModel.getCategory_txt());

    }

    @Override
    public int getItemCount() {
        return popularModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView popular_img;
        TextView popular_txt;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            popular_img = itemView.findViewById(R.id.popular_img);
            popular_txt = itemView.findViewById(R.id.popular_txt);
        }
    }
}
