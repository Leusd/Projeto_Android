package com.example.pucminas.cartao_presente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView destinatario;
    private TextView remetente;
    private String newRemetenteText = "HAPPY BIRTHDAY Miley";
    private String newDestinatarioText = "ASS:" +
            "\nMR. President";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        destinatario = (TextView) findViewById(R.id.destinatario);
        remetente = (TextView) findViewById(R.id.remetente);
    }

    public void invertNames(View view){
        String destinatarioText = (String) destinatario.getText();
        String remetenteText = (String) remetente.getText();

        destinatario.setText(newDestinatarioText);
        remetente.setText(newRemetenteText);

        newDestinatarioText = destinatarioText;
        newRemetenteText = remetenteText;
    }

    public void sendCard(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("MEUTEXTO", newDestinatarioText + "Enviado com sucesso");
        startActivity(intent);
    }
}
