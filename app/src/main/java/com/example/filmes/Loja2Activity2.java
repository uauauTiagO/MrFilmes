package com.example.filmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Loja2Activity2 extends AppCompatActivity {
Button btnAnterior,btnBlackW,btnVelocidadeF,btnChangC,btnironMan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja22);

        btnironMan=findViewById(R.id.btnironMan);
        btnBlackW=findViewById(R.id.btnBlackW);
        btnChangC=findViewById(R.id.btnChangC);
        btnVelocidadeF=findViewById(R.id.btnVelocidadeF);
        btnAnterior=findViewById(R.id.btnAnterior);





        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Loja2Activity2.this, LojaActivity.class);
                startActivity(intent);
            }
        });
        btnVelocidadeF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(Loja2Activity2.this,metodosDepagamento.class);
                startActivity(intent2);
            }
        });
        btnChangC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(Loja2Activity2.this,metodosDepagamento.class);
                startActivity(intent2);
            }
        });
        btnironMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(Loja2Activity2.this,metodosDepagamento.class);
                startActivity(intent2);
            }
        });
        btnBlackW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(Loja2Activity2.this,metodosDepagamento.class);
                startActivity(intent2);
            }
        });

    }
}