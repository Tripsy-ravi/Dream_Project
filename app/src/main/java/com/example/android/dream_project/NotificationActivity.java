package com.example.android.dream_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {

    ArrayList<NotificationModel> notificationlistitemModelArrayList=new ArrayList<NotificationModel>();
    RecyclerView notificationrecview;


    @Override
    public void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);


        notificationrecview=findViewById(R.id.notificationlistrecview);


        LinearLayoutManager llm=new LinearLayoutManager(this);
        notificationrecview.setLayoutManager(llm);



        notificationlistitemModelArrayList.add(new NotificationModel(R.color.Aqua,R.color.yellow,"50% OFF is simply dummy text of printing and type setting industry","Yesterday"));
        notificationlistitemModelArrayList.add(new NotificationModel(R.color.Aqua,R.color.yellow,"50% OFF is simply dummy text of printing and type setting industry","Yesterday"));
        notificationlistitemModelArrayList.add(new NotificationModel(R.color.Aqua,R.color.yellow,"50% OFF is simply dummy text of printing and type setting industry","Yesterday"));
        notificationlistitemModelArrayList.add(new NotificationModel(R.color.Aqua,R.color.yellow,"50% OFF is simply dummy text of printing and type setting industry","Yesterday"));
        notificationlistitemModelArrayList.add(new NotificationModel(R.color.Aqua,R.color.yellow,"50% OFF is simply dummy text of printing and type setting industry","Yesterday"));
        notificationlistitemModelArrayList.add(new NotificationModel(R.color.Aqua,R.color.yellow,"50% OFF is simply dummy text of printing and type setting industry","Yesterday"));


        NotificationListAdapter adapter=new NotificationListAdapter(this,notificationlistitemModelArrayList);
        notificationrecview.setAdapter(adapter);




    }
}