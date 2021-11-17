package com.example.proyectoismaelsalfate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Trajes;

public class Trajes_act extends AppCompatActivity {

    private Spinner trajes;
    private TextView result;
    private RatingBar calificar;
    private Trajes tra = new Trajes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trajes);

        trajes = findViewById(R.id.spntrajes);
        result = findViewById(R.id.result);
        calificar = findViewById(R.id.ratingBar);

        Bundle bun = getIntent().getExtras();
        String[] listado = bun.getStringArray("trajes");

        ArrayAdapter adaptTrajes = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listado);
        trajes.setAdapter(adaptTrajes);
    }

    public void Calcular(View view)
    {

        String opcion = trajes.getSelectedItem().toString();
        int resultado = 0;

        for (int i = 0 ; i < opcion.length(); i++)
        {
            if(opcion.equals(tra.getTrajes()[i]))
            {
                resultado = tra.anadirAdicional(tra.getPrecios()[i], 500);
                calificar.setRating(i+1);
                break;
            }

        }
        result.setText("La opción es: " + opcion + "\nSu precio es: " + resultado);
    }
}