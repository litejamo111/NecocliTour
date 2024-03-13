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
        listarestaurantes.add(new restaurante(getString(R.string.res1),"3225962363",getString(R.string.dres1),"COP 25.000",4,R.drawable.res1));
        listarestaurantes.add(new restaurante(getString(R.string.res2),"3225962363",getString(R.string.dres2),"COP 15.000",4,R.drawable.res2));
        listarestaurantes.add(new restaurante(getString(R.string.res3),"3225962363",getString(R.string.dres3),"COP 20.000",4,R.drawable.res3));
        listarestaurantes.add(new restaurante(getString(R.string.res4),"3225962363",getString(R.string.dres4),"COP 30.000",4,R.drawable.res4));
        listarestaurantes.add(new restaurante(getString(R.string.res5),"3225962363",getString(R.string.dres5),"COP 18.000",4,R.drawable.res5));
    }
}