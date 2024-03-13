package com.example.sanrafa.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.sitiosampliados;
import com.example.sanrafa.R;
import com.example.sanrafa.moldes.sitio;

import java.util.ArrayList;

public class sitioadaptador extends RecyclerView.Adapter<sitioadaptador.viewHolder>{
    //atributos de la clase
    public ArrayList<sitio> listasitios;

    //constrcutor vacio

    public sitioadaptador() {
    }

    //constructor lleno
    public sitioadaptador(ArrayList<sitio> listasitios) {
        this.listasitios = listasitios;
    }

    @NonNull
    @Override
    public sitioadaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios,null,false);
        return new sitioadaptador.viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull sitioadaptador.viewHolder holder, int position) {
        holder.pintarMolde(listasitios.get(position));
    }

    @Override
    public int getItemCount() {
        return listasitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        //asocio los elementos del xml del molde
        ImageView fotositioMolde;
        TextView nombresitioMolde;
        TextView preciositioMolde;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotositioMolde=itemView.findViewById(R.id.fotomoldesitios);
            nombresitioMolde=itemView.findViewById(R.id.nombresitiosmolde);
            preciositioMolde=itemView.findViewById(R.id.preciomoldesitios);
        }

        public void pintarMolde(sitio sitio) {
            fotositioMolde.setImageResource(sitio.getFoto());
            nombresitioMolde.setText(sitio.getNombre());
            preciositioMolde.setText(sitio.getPrecio());

            //Quiero escuchar clic en cada uno de los elementos de
            //la lista
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), sitiosampliados.class);
                    intent.putExtra("datositio",sitio);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}
