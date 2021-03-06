package com.example.filmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class metodosDepagamento extends AppCompatActivity {
    Button btnPagar,btnVoltar;
    RadioButton rbMastercard,rbPaypal,rbVisa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodos_depagamento);

        rbMastercard=findViewById(R.id.rbMastercard);
        rbPaypal=findViewById(R.id.rbPaypal);
        rbVisa=findViewById(R.id.rbVisa);
        btnPagar=findViewById(R.id.btnPagar);
        btnVoltar=findViewById(R.id.btnback2);

        if(rbMastercard.isChecked()==true)
        {
            rbPaypal.setChecked(false);
            rbVisa.setChecked(false);
        }
        else if(rbPaypal.isChecked()==true)
        {
            rbMastercard.setChecked(false);
            rbVisa.setChecked(false);
        }
        else if(rbVisa.isChecked()==true)
        {
            rbPaypal.setChecked(false);
            rbPaypal.setChecked(false);
        }

        btnPagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rbMastercard.isChecked()==false && rbPaypal.isChecked()==false && rbVisa.isChecked()==false)
                {
                    Toast.makeText(getApplicationContext(), "Tem de selecionar um metodo de pagamento", Toast.LENGTH_SHORT).show();
                }
                else if(rbPaypal.isChecked()==true)
                {
                    Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.paypal.com/signin"));
                    startActivity(viewIntent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Filme comprado,obrigado pela sua colabora????o", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(metodosDepagamento.this,LojaActivity.class);
                Log.i("TAG", "onClick: ");
                startActivity(intent);
            }
        });
    }
}