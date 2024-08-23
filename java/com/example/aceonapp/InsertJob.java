package com.example.aceonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertJob extends AppCompatActivity {
    EditText name, email, age;
    Button insert, view, delete,update;
    DBHelper2 DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_job2);

        name = findViewById(R.id.name);
        email= findViewById(R.id.email);
        age = findViewById(R.id.age);
        insert = findViewById(R.id.btnInsert);
        view = findViewById(R.id.btnView);
        delete = findViewById(R.id.btnDelete);
        update=findViewById(R.id.btnUpdate);

        DB = new DBHelper2(this);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InsertJob.this, UserList.class));
            }
        });

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameTXT = name.getText().toString();
                String emailTXT = email.getText().toString();
                String ageTXT = age.getText().toString();

                Boolean checkinsertdata  = DB.insertuserdata(nameTXT, emailTXT, ageTXT);
                if(checkinsertdata==true)
                {
                    Toast.makeText(InsertJob.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(InsertJob.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
                }

            }
        });


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameTXT = name.getText().toString();

                Boolean checkdeletedata  = DB.deleteuserdata(nameTXT);
                if(checkdeletedata==true)
                {
                    Toast.makeText(InsertJob.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(InsertJob.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
                }

            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //DB.updateData(name.getText().toString(),email.getText().toString(), age.getText().toString());
//                String nameTXT = name.getText().toString();
//                Boolean updateData=DB.updateData(nameTXT);
                Toast.makeText(InsertJob.this, "Product Updated..", Toast.LENGTH_SHORT).show();

            }
        });

    }
}