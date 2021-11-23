package com.example.filmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Criar_ContaActivity extends AppCompatActivity {

    Button btnCriar1,btnVoltar;
    EditText txtPass2,txtConfirmarPass,txtNomeUtilizador2;
    String pass,confirmar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);

        txtNomeUtilizador2=findViewById(R.id.txtNomeUtilizador2);
        txtPass2=findViewById(R.id.txtPass2);
        txtConfirmarPass=findViewById(R.id.txtConfirmarPass);
        btnCriar1=findViewById(R.id.btnCriar1);
        btnVoltar=findViewById(R.id.btnVoltar);

        btnCriar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txtNomeUtilizador2.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Insira um nome de utilizador", Toast.LENGTH_SHORT).show();
                }
                else if (txtPass2.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Tem de inserir Password", Toast.LENGTH_SHORT).show();
                }
                else if (txtConfirmarPass.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Tem de confirmar Password", Toast.LENGTH_SHORT).show();
                }
                else if(!txtPass2.getText().toString().equals(txtConfirmarPass.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Passwords diferentes", Toast.LENGTH_SHORT).show();
                }
                else
                {

                    Intent intent = new Intent(Criar_ContaActivity.this, MainActivity.class);
                    intent.putExtra("nome", txtNomeUtilizador2.getText().toString());
                    intent.putExtra("pass", txtPass2.getText().toString());
                    startActivity(intent);
                }
            }
        });
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Criar_ContaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}