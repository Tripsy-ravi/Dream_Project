package com.example.android.dream_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HelpActivity extends AppCompatActivity {

    ImageView general_issues,partner_onboarding,legality,faq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        general_issues = (ImageView) findViewById(R.id.general_issues);
        partner_onboarding = (ImageView) findViewById(R.id.partner_onboarding);
        legality = (ImageView) findViewById(R.id.legality);
        faq = (ImageView) findViewById(R.id.faq);

        general_issues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        partner_onboarding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        legality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}