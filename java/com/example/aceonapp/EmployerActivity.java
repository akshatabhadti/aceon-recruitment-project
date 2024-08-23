package com.example.aceonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmployerActivity extends AppCompatActivity {

    private Button intern,postJob,response,empAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employer);

        postJob = findViewById(R.id.job);
        postJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), InsertJob.class);
                startActivity(i);
            }
        });

        intern = findViewById(R.id.internship);
        intern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(getApplicationContext(), postIntern.class);
                //startActivity(i);
            }
        });

        empAcc = findViewById(R.id.eProfile);
        empAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(getApplicationContext(), Empfp.class);
                //startActivity(i);
            }
        });

        response = findViewById(R.id.reply);
        response.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(getApplicationContext(), reply.class);
                //startActivity(i);
            }
        });



    }
}