package com.adnan.myfirstapp.recyclerviewexample3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Data> data = fill_with_data();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView_Adapter adapter = new RecyclerView_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    private List<Data> fill_with_data() {
        List<Data> data = new ArrayList<>();
        data.add(new Data("C", R.drawable.c));
        data.add(new Data("C++", R.drawable.cc));
        data.add(new Data("Java", R.drawable.java));
        data.add(new Data("Android", R.drawable.android));
        data.add(new Data("Kotlin", R.drawable.kotlin));
        data.add(new Data("Html", R.drawable.html));
        data.add(new Data("CSS", R.drawable.css));
        data.add(new Data("JavaScript", R.drawable.js));
        data.add(new Data("SQl", R.drawable.sql));
        data.add(new Data("SQL Server", R.drawable.sqls));
        data.add(new Data("Data Structure", R.drawable.data_structure));
        data.add(new Data("Json", R.drawable.json));
        data.add(new Data("JSP", R.drawable.jsp));
        data.add(new Data("Alexa Skills", R.drawable.alexa));
        return data;

    }


}