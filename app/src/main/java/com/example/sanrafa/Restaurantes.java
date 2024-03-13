package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Restaurantes extends AppCompatActivity {

    Button botonverrestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        botonverrestaurantes=findViewById(R.id.botonhomerestaurantes);

        botonverrestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Restaurantes.this, listarestaurantes.class);
                startActivity(intent);

            }
        });


    }
}