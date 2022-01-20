/*
package com.example.filmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class listaActivity extends AppCompatActivity {

    RecyclerView rclista;
    ArrayList<Historico>historicoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rclista);
        recyclerView.setLayoutManager(linearLayoutManager);
        Intent intent = new Intent(listaActivity.this,MainActivity.class);
        historicoList = (ArrayList<Historico>)getIntent().getSerializableExtra("lista");
        rclista=findViewById(R.id.rclista);
        setAdapter();
    }
    private void setAdapter(){
        recyclerAdapter adapter = new recyclerAdapter(historicoList);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getApplicationContext());
        rclista.setLayoutManager(layoutManager);
        rclista.setItemAnimator(new DefaultItemAnimator());
        rclista.setAdapter(adapter);
    }
}*/
