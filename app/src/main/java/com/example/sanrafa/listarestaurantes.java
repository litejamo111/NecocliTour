package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.restauranteadaptador;
import com.example.sanrafa.moldes.restaurante;

import java.util.ArrayList;

public class listarestaurantes extends AppCompatActivity {

    ArrayList<restaurante> listarestaurantes=new ArrayList<>();
    RecyclerView recyclerViewrestaurantes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        recyclerViewrestaurantes=findViewById(R.id.listadinamicarestaurantes);
        recyclerViewrestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        restauranteadaptador adaptador= new restauranteadaptador(listarestaurantes);
        recyclerViewrestaurantes.setAdapter(adaptador);


    }

    public void crearListaHoteles(){
        listarestaurantes.add(new restaurante("hoteles el mocho","3225962363","calle 100","500 usd",4,R.drawable.hotel1));
        listarestaurantes.add(new restaurante("hoteles donde alicia","2548898","calle ","500 usd",4,R.drawable.hotele2));
    }
}