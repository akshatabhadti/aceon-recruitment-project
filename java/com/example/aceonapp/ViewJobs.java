package com.example.aceonapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class ViewJobs extends AppCompatActivity {

//    private ArrayList<JobModal>jobModalArrayList;
//    private DatabaseHelper dbHandler;
//    private jobRVAdapter jobRVAdapter;
//    private RecyclerView jobRV;


//    RecyclerView recyclerView;
//    ArrayList<String> name, email, age;
//    MyAdapter adapter;
//    DBHelper2 DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_jobs);

        //dbHandler=new DatabaseHelper(this);

        //jobModalArrayList=dbHandler.showJobs();

         //jobRVAdapter= new jobRVAdapter(jobModalArrayList, ViewJobs.this);
        //jobRV = findViewById(R.id.idRVJobs);

        // setting layout manager for our recycler view.
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ViewJobs.this, RecyclerView.VERTICAL, false);
//        jobRV.setLayoutManager(linearLayoutManager);
//
//        // setting our adapter to recycler view.
//        jobRV.setAdapter(jobRVAdapter);
//
//
    }
}
//}


//        recyclerView = findViewById(R.id.recyclerview);
//        adapter = new MyAdapter(this, name, email, age);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        displaydata();



//    private void displaydata() {
//        Cursor cursor = DB.getdata();
//        if (cursor.getCount() == 0) {
//            Toast.makeText(ViewJobs.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
//            return;
//        } else {
//            while (cursor.moveToNext()) {
//                name.add(cursor.getString(0));
//                email.add(cursor.getString(1));
//                age.add(cursor.getString(2));
//            }
//        }
//    }
