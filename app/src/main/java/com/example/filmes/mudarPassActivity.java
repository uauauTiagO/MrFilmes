package com.example.filmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class mudarPassActivity extends AppCompatActivity {
    Button btnMudar,btnVoltar2;
    EditText txtNomeUtilizador3,txtPass3,txtConfirmarPass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mudar_pass);

        btnMudar=findViewById(R.id.btnCriar3);
        btnVoltar2=findViewById(R.id.btnVoltar2);
        txtNomeUtilizador3=findViewById(R.id.txtNomeUtilizador3);
        txtPass3=findViewById(R.id.txtPass3);
        txtConfirmarPass2=findViewById(R.id.txtConfirmarPass2);

        LoginDAO loginDAO = new LoginDAO(this);

        btnMudar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


/*
                if (txtNomeUtilizador3.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Insira um nome de utilizador", Toast.LENGTH_SHORT).show();
                }
                else if (txtPass3.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Tem de inserir Password", Toast.LENGTH_SHORT).show();
                }
                else if (txtConfirmarPass2.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Tem de confirmar Password", Toast.LENGTH_SHORT).show();
                }
                else if(!txtPass3.getText().toString().equals(txtConfirmarPass2.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Passwords diferentes", Toast.LENGTH_SHORT).show();
                }
                else
                {*/
                Login login = new Login(txtNomeUtilizador3.getText().toString(), txtPass3.getText().toString());
                    Boolean result = loginDAO.checkutilizador(txtNomeUtilizador3.getText().toString());
                    if(result.equals(true)){
                        loginDAO.alterapassword(txtPass3.getText().toString(), login);
                        Intent intent = new Intent(mudarPassActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                /*}*/
            }
        });


                btnVoltar2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(mudarPassActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                });
    }
}