package com.shariff.recylerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  CustomAdapter.OnItemClickListener{


    RecyclerView RcView;
    ArrayList<Item>  data;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<>();
        RcView = findViewById(R.id.my_list);
        RcView.setHasFixedSize(true);
        RcView.setLayoutManager(new LinearLayoutManager(this));
        Item p1= new Item("Rice","Nice Food",R.drawable.logo);
        Item p2= new Item("Maharagwe","Nice Food",R.drawable.logo);
        Item p3= new Item("Supu","Nice Food",R.drawable.logo);
        Item p4= new Item("Brones","Nice Food",R.drawable.logo);
        Item p5= new Item("Fish","Nice Food",R.drawable.logo);

        data.add(p1);data.add(p2);data.add(p3);data.add(p4);data.add(p5);

        adapter = new CustomAdapter(this,data);
        RcView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position) {
        String name=data.get(position).getName();
        Toast.makeText(this, "Person's "+name, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onVerifyClick(int position) {
        String name=data.get(position).getName();
        Toast.makeText(this, "Person's "+name, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDeleteClick(int position) {
        String name=data.get(position).getName();
        Toast.makeText(this, "Person's "+name, Toast.LENGTH_SHORT).show();
    }
}