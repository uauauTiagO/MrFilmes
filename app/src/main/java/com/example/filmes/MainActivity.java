package com.example.filmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.firestore.auth.User;

public class MainActivity extends AppCompatActivity {

    Button btnCriar,btnIniciar,btnSair,btnMudar;
    EditText txtNomeUtilizador, txtPass;
    String utilizador, passw;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCriar=findViewById(R.id.btnCriar);
        btnIniciar=findViewById(R.id.btnIniciar);
        btnSair=findViewById(R.id.btnSair);
        txtNomeUtilizador=findViewById(R.id.txtNomeUtilizador);
        txtPass=findViewById(R.id.txtPass);
        btnMudar=findViewById(R.id.btnMudarPass);

        LoginDAO loginDAO = new LoginDAO(this);



        btnMudar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,mudarPassActivity.class);
                startActivity(intent);
            }
        });


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

//                String nome,pass;
                Intent intent = new Intent(MainActivity.this, Criar_ContaActivity.class);
//                nome=getIntent().getStringExtra("nome");
//                pass=getIntent().getStringExtra("pass");

                utilizador=txtNomeUtilizador.getText().toString();
                passw=txtPass.getText().toString();


                if(utilizador.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Insira o seu nome de utilizador", Toast.LENGTH_SHORT).show();
                }

                else if(loginDAO.verificacaologin(utilizador, passw)) {

                    intent = new Intent(MainActivity.this,menuActivity2.class);
                    intent.putExtra("nome",txtNomeUtilizador.getText().toString());
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