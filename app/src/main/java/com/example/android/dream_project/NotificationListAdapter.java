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

public class NotificationListAdapter extends RecyclerView.Adapter<NotificationListAdapter.ViewHolder> {

    Context context;
    ArrayList<NotificationModel> notificationModelArrayList = new ArrayList<NotificationModel>();


    public NotificationListAdapter(Context context, ArrayList<NotificationModel> notificationModelArrayList) {
        this.context = context;
        this.notificationModelArrayList = notificationModelArrayList;
    }


    @NonNull
    @Override
    public NotificationListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_invitation,parent,false);
        return new NotificationListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationListAdapter.ViewHolder holder, int position) {

        NotificationModel notificationModel = notificationModelArrayList.get(position);
        holder.notilistitemimg.setImageResource(notificationModel.getNotificationimg());
        holder.notilistitemseen.setImageResource(notificationModel.getNotificationseen());
        holder.notilistitemmsg.setText(notificationModel.getNotificationmsg());
        holder.notilistitemtime.setText(notificationModel.getNotificationtime());

    }

    @Override
    public int getItemCount() {
        return notificationModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        ImageView notilistitemimg, notilistitemseen;
        TextView notilistitemmsg, notilistitemtime;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            notilistitemimg = itemView.findViewById(R.id.notilistitemimg);
            notilistitemseen = itemView.findViewById(R.id.notilistitemseen);
            notilistitemmsg = itemView.findViewById(R.id.notilistitemmsg);
            notilistitemtime = itemView.findViewById(R.id.notilistitemtime);
        }
    }
}
