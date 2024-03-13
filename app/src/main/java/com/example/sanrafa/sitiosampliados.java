package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanrafa.moldes.sitio;

public class sitiosampliados extends AppCompatActivity {

    sitio datositio;
    TextView titulositio;
    ImageView imagensitio;
    TextView calificacionsitio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_ampliados);

        titulositio=findViewById(R.id.tituloampliadositios);
        imagensitio=findViewById(R.id.fotoampliandositios);
        calificacionsitio=findViewById(R.id.calificacionaplainsitios);


        datositio=(sitio)getIntent().getSerializableExtra("datositio");

        titulositio.setText(datositio.getNombre());
        imagensitio.setImageResource(datositio.getFoto());
        calificacionsitio.setText(Integer.toString(datositio.getCalificacion()));

    }
}