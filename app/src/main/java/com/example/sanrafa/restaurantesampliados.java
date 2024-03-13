package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanrafa.moldes.restaurante;

public class restaurantesampliados extends AppCompatActivity {

    restaurante datosrestaurantes;
    TextView titulorestaurante;
    ImageView imagenrestaurante;
    TextView calificacionrestaurante;

    TextView descripcionresamp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_ampliados);

        titulorestaurante=findViewById(R.id.tituloampliadorestaurantes);
        imagenrestaurante=findViewById(R.id.fotoampliandorestaurantes);
        calificacionrestaurante=findViewById(R.id.calificacionaplainrestaurantes);
        descripcionresamp=findViewById(R.id.descripcionresamp);


        datosrestaurantes=(restaurante) getIntent().getSerializableExtra("datosrestaurantes");

        titulorestaurante.setText(datosrestaurantes.getNombre());
        imagenrestaurante.setImageResource(datosrestaurantes.getFoto());
        calificacionrestaurante.setText(Integer.toString(datosrestaurantes.getCalificacion()));
        descripcionresamp.setText(datosrestaurantes.getDireccion());

    }
}