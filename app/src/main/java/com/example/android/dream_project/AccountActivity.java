package com.example.android.dream_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AccountActivity extends AppCompatActivity {

    LinearLayout notification,rating,payment,setting,yourOrders,favouriteOrders,addressBook,refunds,help,support,about;
    TextView user_name,user_number,user_location,googleRate,logOut;
    CardView share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        notification = (LinearLayout) findViewById(R.id.notification);
        rating = (LinearLayout) findViewById(R.id.rating);
        payment = (LinearLayout) findViewById(R.id.payment);
        setting = (LinearLayout) findViewById(R.id.setting);
        yourOrders = (LinearLayout) findViewById(R.id.yourOrders);
        favouriteOrders = (LinearLayout) findViewById(R.id.favouriteOrders);
        addressBook = (LinearLayout) findViewById(R.id.addressBook);
        refunds = (LinearLayout) findViewById(R.id.refunds);
        help = (LinearLayout) findViewById(R.id.help);
        support = (LinearLayout) findViewById(R.id.support);
        about = (LinearLayout) findViewById(R.id.about);
        user_name = (TextView) findViewById(R.id.user_name);
        user_number = (TextView) findViewById(R.id.user_mobile);
        user_location = (TextView) findViewById(R.id.user_loc);
        share = (CardView) findViewById(R.id.share);
        googleRate = (TextView) findViewById(R.id.googleRate);
        logOut = (TextView) findViewById(R.id.logOut);

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountActivity.this,NotificationActivity.class);
                startActivity(intent);
            }
        });

        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        yourOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountActivity.this,OrdersActivity.class);
                startActivity(intent);
            }
        });

        favouriteOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountActivity.this,FavouriteOrdersActivity.class);
                startActivity(intent);
            }
        });

        addressBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        refunds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountActivity.this,HelpActivity.class);
                startActivity(intent);
            }
        });

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        googleRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}