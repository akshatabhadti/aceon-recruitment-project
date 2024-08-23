package com.example.aceonapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {
    RecyclerView rcv;
    MyAdapter2 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler and Card View Demo");

        rcv = (RecyclerView) findViewById(R.id.recview);
        //  rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MyAdapter2(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

        //LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("C Intern");
        ob1.setDesc("C Programming");
        ob1.setImgname(R.drawable.java);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("C++ Programmer");
        ob2.setDesc("Desktop Programming Language");
        ob2.setImgname(R.drawable.java);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("Java Developer");
        ob3.setDesc("Desktop Programming Language");
        ob3.setImgname(R.drawable.java);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("PHP Programming");
        ob4.setDesc("Web Progamming Language");
        ob4.setImgname(R.drawable.java);
        holder.add(ob4);

        Model ob6=new Model();
        ob6.setHeader("Wordpress Framework");
        ob6.setDesc("PHP based Blogging Framework");
        ob6.setImgname(R.drawable.java);
        holder.add(ob6);

        Model ob8=new Model();
        ob8.setHeader("Shopify Framework");
        ob8.setDesc("PHP based e-Comm Framework");
        ob8.setImgname(R.drawable.java);
        holder.add(ob8);

        return holder;
    }
}