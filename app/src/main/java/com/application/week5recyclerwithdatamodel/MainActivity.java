package com.application.week5recyclerwithdatamodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView mRecyclerView;
    FloatingActionButton mbutton;

    RecyclerView.LayoutManager manager;

    MyAdapter myAdapter;



//    ....Adapter


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mbutton = findViewById(R.id.floatingActionButton);

        List<MyDataModel> persons = new ArrayList<>();
        persons.add(new MyDataModel("Name 1", "Description 1 "));
        persons.add(new MyDataModel("Name 1", "Description 1 "));
        persons.add(new MyDataModel("Name 1", "Description 1 "));
        persons.add(new MyDataModel("Name 1", "Description 1 "));
        persons.add(new MyDataModel("Name 1", "Description 1 "));
        persons.add(new MyDataModel("Name 1", "Description 1 "));

        manager = new LinearLayoutManager(this);
        myAdapter = new MyAdapter(this, persons);

        mRecyclerView.setAdapter(myAdapter);

//        setAdapter...

        mRecyclerView.setLayoutManager(manager);



    }
}