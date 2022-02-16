package com.example.android.dream_project;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {

    Context context;
    private onNoteListener mOnNoteListener;
    ArrayList<OrderModel> orderModelArrayList = new ArrayList<OrderModel>();

    public OrderAdapter(Context context, ArrayList<OrderModel> orderModelArrayList,onNoteListener onNoteListener) {
        this.context = context;
        this.orderModelArrayList = orderModelArrayList;
        this.mOnNoteListener = onNoteListener;
    }

    @NonNull
    @Override
    public OrderAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_orders,parent,false);
        return new ViewHolder(view,mOnNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.ViewHolder holder, int position) {
        OrderModel orderModell = orderModelArrayList.get(position);
        holder.orderimg.setImageResource(orderModell.getOrderimg());
        holder.restname.setText(orderModell.getRestname());
        holder.orderdetails.setText(orderModell.getOrderdetails());
        holder.totalitems.setText(orderModell.getTotalitems());
        holder.cost.setText(orderModell.getCost());
        holder.status.setText(orderModell.getStatus());



    }

    @Override
    public int getItemCount() {
        return orderModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView restname,orderdetails,totalitems,cost,status;
        ImageView orderimg;
        onNoteListener onNoteListener;

        public ViewHolder(@NonNull View itemView,onNoteListener onNoteListener) {
            super(itemView);
            this.onNoteListener = onNoteListener;
            orderimg = itemView.findViewById(R.id.orderimg);
            restname = itemView.findViewById(R.id.restname);
            orderdetails = itemView.findViewById(R.id.orderdetails);
            totalitems = itemView.findViewById(R.id.totalitems);
            cost = itemView.findViewById(R.id.cost);
            status = itemView.findViewById(R.id.status);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }

    public interface onNoteListener{
        public void onNoteClick(int position);
    }
}


