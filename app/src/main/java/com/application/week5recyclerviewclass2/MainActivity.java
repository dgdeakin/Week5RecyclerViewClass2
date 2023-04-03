package com.application.week5recyclerviewclass2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    String[] names = {
            "Name 1",
            "Name 2",
            "Name 3",
            "Name 4",
            "Name 5",
            "Name 6",
            "Name 7",
            "Name 8",
            "Name 9",
            "Name 10",
    };

    RecyclerView.LayoutManager layoutManager;

    MyAdapter myAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);

        myAdapter = new MyAdapter(this, names);

        layoutManager = new LinearLayoutManager(this);


        mRecyclerView.setAdapter(myAdapter);
        mRecyclerView.setLayoutManager(layoutManager);
    }
}