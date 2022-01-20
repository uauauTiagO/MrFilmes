package com.example.filmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menuActivity2 extends AppCompatActivity {

    Button btnLojaMenu,btnPerfilMenu,btnSairMenu;
    TextView txtnome;
    String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        btnLojaMenu=findViewById(R.id.btnLojaMenu);
        btnPerfilMenu=findViewById(R.id.btnPerfilMenu);
        btnSairMenu=findViewById(R.id.btnSairMenu);
        txtnome=findViewById(R.id.txtnome22);
        Intent intent = new Intent(menuActivity2.this,perfilActivity.class);
        nome = getIntent().getStringExtra("nome");
        txtnome.setText(nome);


        btnLojaMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuActivity2.this,LojaActivity.class);
                startActivity(intent);
            }
        });
        btnPerfilMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuActivity2.this,perfilActivity.class);
                intent.putExtra("nome", txtnome.getText().toString());
                startActivity(intent);
            }
        });
        btnSairMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}