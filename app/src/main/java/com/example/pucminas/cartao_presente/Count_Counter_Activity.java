package com.example.pucminas.cartao_presente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Count_Counter_Activity extends AppCompatActivity {
    private TextView resultado1;
    private TextView resultado2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Count_Counter);

        resultado1 = (TextView) findViewById(R.id.resultado1);
        resultado2 = (TextView) findViewById(R.id.resultado2);
    }

    public void atualizaresultado(View view){
        if(view.getId() == R.id.time13){
            resultado1.setText(Integer.parseInt(resultado1.getText().toString())+3);
        }else if(view.getId() == R.id.time23){
            resultado2.setText(Integer.parseInt(resultado1.getText().toString())+3);
        }else if(view.getId() == R.id.time12){
            resultado1.setText(Integer.parseInt(resultado1.getText().toString())+2);
        }else if(view.getId() == R.id.time22){
            resultado2.setText(Integer.parseInt(resultado1.getText().toString())+2);
        }else if(view.getId() == R.id.time1FREE){
            resultado1.setText(Integer.parseInt(resultado1.getText().toString())+1);
        }else if(view.getId() == R.id.time2FREE){
            resultado2.setText(Integer.parseInt(resultado1.getText().toString())+1);
        }

    }
}
