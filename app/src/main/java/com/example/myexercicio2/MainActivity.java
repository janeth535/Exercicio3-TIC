package com.example.myexercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txv;
    Button btt;
    EditText txt_nome, txt_sobrenome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv = findViewById(R.id.txt_oinome);
        btt = findViewById(R.id.txt_ok);
        txt_nome = findViewById(R.id.txt_nome);
        txt_sobrenome = findViewById(R.id.txt_sobreno);

        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = txt_nome.getText().toString();
                String sobreno = txt_sobrenome.getText().toString();

                if (nome.isEmpty() || sobreno.isEmpty()) {
                   // txv.setText("Nome não inserido");
                    Toast.makeText(MainActivity.this,"Nome não inserido",Toast.LENGTH_LONG).show();

                } else {
                   // txv.setText("Olá " + nome + " " + sobreno);
                    Toast.makeText(MainActivity.this,"Olá " + nome + " " + sobreno,Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}