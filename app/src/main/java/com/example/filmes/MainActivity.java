package com.example.filmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCriar,btnIniciar,btnSair;
    EditText txtNomeUtilizador, txtPass;
    String utilizador, passw;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnSair=findViewById(R.id.btnSair);
        txtPass=findViewById(R.id.txtPass);
        txtNomeUtilizador=findViewById(R.id.txtNomeUtilizador);
        btnCriar=findViewById(R.id.btnCriar);
        btnIniciar=findViewById(R.id.btnIniciar);


        btnCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Criar_ContaActivity.class);
                startActivity(intent);
            }
        });

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome,pass;
                Bundle extra=getIntent().getExtras();
                nome=extra.getString("nome");
                pass=extra.getString("pass");
                utilizador=txtNomeUtilizador.getText().toString();
                passw=txtPass.getText().toString();
                Intent intent = new Intent(MainActivity.this,LojaActivity.class);
                if(txtNomeUtilizador.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Insira o seu nome de utilizador", Toast.LENGTH_SHORT).show();
                }
                else if (txtNomeUtilizador.getText().toString().equals("Admin")&&txtPass.getText().toString().equals("admin123") )
                {
                    startActivity(intent);
                }
                else if(txtNomeUtilizador.getText().toString().equals(nome) && txtPass.getText().toString().equals(pass))
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Utilizador errado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });





    }
}