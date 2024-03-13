package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.sitioadaptador;
import com.example.sanrafa.moldes.sitio;

import java.util.ArrayList;

public class listasitios extends AppCompatActivity {
    ArrayList<sitio> listasitios=new ArrayList<>();
    RecyclerView recyclerViewsitios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);

        recyclerViewsitios=findViewById(R.id.listadinamicasitios);
        recyclerViewsitios.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearlistasitios();
        sitioadaptador adaptador= new sitioadaptador(listasitios);
        recyclerViewsitios.setAdapter(adaptador);


    }

    public void crearlistasitios(){
        listasitios.add(new sitio("hoteles el mocho","3225962363","calle 100","500 usd",4,R.drawable.hotel1));
        listasitios.add(new sitio("hoteles donde alicia","2548898","calle ","500 usd",4,R.drawable.hotele2));
    }
}