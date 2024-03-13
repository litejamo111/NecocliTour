package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.sanrafa.adaptadores.HotelAdaptador;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<Hotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerViewHoteles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerViewHoteles=findViewById(R.id.listadinamicahoteles);
        recyclerViewHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        HotelAdaptador adaptador= new HotelAdaptador(listaHoteles);
        recyclerViewHoteles.setAdapter(adaptador);


    }

    public void crearListaHoteles(){
        listaHoteles.add(new Hotel(getString(R.string.hotel1),"3225962363",getString(R.string.dhotel1),"COP 125.000",4,R.drawable.hotel1));
        listaHoteles.add(new Hotel(getString(R.string.hotel2),"2548898",getString(R.string.dhotel2),"COP 125.000",4,R.drawable.hotel2));
        listaHoteles.add(new Hotel(getString(R.string.hotel3),"2548898",getString(R.string.dhotel3),"COP 185.000",4,R.drawable.hotel3));
        listaHoteles.add(new Hotel(getString(R.string.hotel4),"2548898",getString(R.string.dhotel4),"COP 125.000",4,R.drawable.hotel4));
        listaHoteles.add(new Hotel(getString(R.string.hotel5),"2548898",getString(R.string.dhotel5),"COP 250.000",4,R.drawable.hotel5));

    }
}