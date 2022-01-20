package com.example.filmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class LojaActivity extends AppCompatActivity {
Button btnProximo,btnKvsG,btnVenom,btnHomemA, btnAvengers;
ImageButton btnSeta2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja);

        btnAvengers=findViewById(R.id.btnAvengers);
        btnKvsG=findViewById(R.id.btnKvsG);
        btnHomemA=findViewById(R.id.btnHomemA);
        btnVenom=findViewById(R.id.btnVenom);
        btnSeta2=findViewById(R.id.btnSeta2);
        btnProximo=findViewById(R.id.btnProximo);


        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LojaActivity.this, Loja2Activity2.class);
                startActivity(intent);
            }
        });

        btnSeta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LojaActivity.this, menuActivity2.class);
                startActivity(intent);
            }
        });
        btnHomemA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent2 = new Intent(LojaActivity.this,metodosDepagamento.class);
                startActivity(intent2);
            }
        });
        btnKvsG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(LojaActivity.this,metodosDepagamento.class);
                startActivity(intent2);
            }
        });
        btnVenom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(LojaActivity.this,metodosDepagamento.class);
                startActivity(intent2);
            }
        });
        btnAvengers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(LojaActivity.this,metodosDepagamento.class);
                startActivity(intent2);
            }
        });




    }
}