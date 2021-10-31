package com.c.databasesqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.c.databasesqlite.Adapter.CustomAdapter;
import com.c.databasesqlite.DataBaseHelper.DBHelper;

import java.util.ArrayList;

public class Second extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> fname, lname;
    CustomAdapter customAdapter;
    DBHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        myDB = new DBHelper(Second.this);
//        fname = new ArrayList<>();
//        lname = new ArrayList<>();
//
//
//        recyclerView = findViewById(R.id.recyclerView);
//        customAdapter = new CustomAdapter(Second.this,this, fname, lname);
//        recyclerView.setAdapter(customAdapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(Second.this));
    }
}