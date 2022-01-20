package com.example.filmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class mudarNomeActivity extends AppCompatActivity {

    TextView txtNomeUtilizador,txtPass,txtConfirmarPass;
    Button btnCriar,btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mudar_nome);

        txtNomeUtilizador=findViewById(R.id.txtNomeUtilizador4);
        txtPass=findViewById(R.id.txtPass4);
        txtConfirmarPass=findViewById(R.id.txtConfirmarPass3);
        btnCriar=findViewById(R.id.btnCriar3);
        btnVoltar=findViewById(R.id.btnVoltar3);



    }
}