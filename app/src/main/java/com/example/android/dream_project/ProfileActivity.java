package com.example.android.dream_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView profile_name,profile_email;
    EditText name,phone,email,home,work;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profile_name = (TextView) findViewById(R.id.profile_name);
        profile_email = (TextView) findViewById(R.id.profile_email);

        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        email = (EditText) findViewById(R.id.email);
        home = (EditText) findViewById(R.id.home);
        work = (EditText) findViewById(R.id.work);
    }
}