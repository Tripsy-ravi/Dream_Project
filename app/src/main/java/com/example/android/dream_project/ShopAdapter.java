package com.example.android.dream_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder> {

    Context context;
    ArrayList<ShopModel> shopModelArrayList = new ArrayList<ShopModel>();

    public ShopAdapter(Context context, ArrayList<ShopModel> shopModelArrayList) {
        this.context = context;
        this.shopModelArrayList = shopModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_shop,parent,false);
        return new ShopAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ShopModel shopModell = shopModelArrayList.get(position);
        holder.item_name.setText(shopModell.getItemName());
        holder.item_price.setText(shopModell.getItemPrice());
        holder.item_desc.setText(shopModell.getItemDesc());
        holder.item_img.setImageResource(shopModell.getItemImg());

    }

    @Override
    public int getItemCount() {
        return shopModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView item_name,item_desc,item_price;
        CircleImageView item_img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_name = itemView.findViewById(R.id.shop_item);
            item_desc = itemView.findViewById(R.id.item_desc);
            item_price = itemView.findViewById(R.id.item_price);
            item_img = itemView.findViewById(R.id.shop_img);
        }
    }
}
