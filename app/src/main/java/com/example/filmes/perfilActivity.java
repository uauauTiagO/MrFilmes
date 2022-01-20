package com.example.filmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;

public class perfilActivity extends AppCompatActivity {
    TextView txtNome,txtteste,txteliminar,txtencerrar;
    String nome;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        txtNome=findViewById(R.id.txtNome);
        txtteste=findViewById(R.id.txtmudarnome);
        txteliminar=findViewById(R.id.txteliminar);
        txtencerrar=findViewById(R.id.txtencerrar);

        Bundle extra=getIntent().getExtras();

        nome = extra.getString("nome");

        LoginDAO loginDAO = new LoginDAO(this);

        txtNome.setText(nome);




        txtteste.setPaintFlags(txtteste.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        txtencerrar.setPaintFlags(txtencerrar.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        txteliminar.setPaintFlags(txteliminar.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        txtteste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(perfilActivity.this , mudarNomeActivity.class);
                startActivity(intent);
            }
        });
        txteliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginDAO.eliminauser(loginDAO.getLoginPeloNome(nome).getId());
            }
        });
        txtencerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(perfilActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
}