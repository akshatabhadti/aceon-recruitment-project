package com.example.aceonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyAcc extends AppCompatActivity {

    private Button saveAs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_acc);

        saveAs=findViewById(R.id.btnSave);
        saveAs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyAcc.this, "Profile Saved", Toast.LENGTH_SHORT).show();
                Intent intent  = new Intent(getApplicationContext(), PostActivity.class);
                startActivity(intent);
            }
        });
    }
}