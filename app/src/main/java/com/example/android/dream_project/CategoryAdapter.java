package com.example.android.dream_project;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    Context context;
    ArrayList<CategoryModel> categoryModelArrayList = new ArrayList<CategoryModel>();

    public CategoryAdapter(Context context, ArrayList<CategoryModel> categoryModelArrayList) {
        this.context = context;
        this.categoryModelArrayList = categoryModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_stores_category,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        CategoryModel categoryModel = categoryModelArrayList.get(position);
        holder.category_img.setImageResource(categoryModel.getCategory_img());
        holder.category_txt.setText(categoryModel.getCategory_txt());

    }

    @Override
    public int getItemCount() {
        return categoryModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView category_img;
        TextView category_txt;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            category_img = itemView.findViewById(R.id.category_img);
            category_txt = itemView.findViewById(R.id.category_txt);
        }
    }
}
