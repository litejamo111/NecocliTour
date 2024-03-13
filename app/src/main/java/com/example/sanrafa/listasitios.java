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
        listasitios.add(new sitio(getString(R.string.sit1),"3225962363",getString(R.string.dsit1),"Gratis",5,R.drawable.sit1));
        listasitios.add(new sitio(getString(R.string.sit2),"2548898",getString(R.string.dsit2),"Gratis",5,R.drawable.sit2));
        listasitios.add(new sitio(getString(R.string.sit3),"3225962363",getString(R.string.dsit3),"Gratis",5,R.drawable.sit3));
        listasitios.add(new sitio(getString(R.string.sit4),"2548898",getString(R.string.dsit4),"COP 20000",5,R.drawable.sit4));
        listasitios.add(new sitio(getString(R.string.sit5),"3225962363",getString(R.string.dsit5),"Gratis",5,R.drawable.sit5));
    }
}