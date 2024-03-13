package com.example.sanrafa.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.R;
import com.example.sanrafa.moldes.restaurante;
import com.example.sanrafa.restaurantesampliados;

import java.util.ArrayList;

public class restauranteadaptador extends RecyclerView.Adapter<restauranteadaptador.viewHolder>{
    //atributos de la clase
    public ArrayList<restaurante> listarestaurantes;

    //constrcutor vacio

    public restauranteadaptador() {
    }

    //constructor lleno
    public restauranteadaptador(ArrayList<restaurante> listarestaurantes) {
        this.listarestaurantes = listarestaurantes;
    }

    @NonNull
    @Override
    public restauranteadaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurantes,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull restauranteadaptador.viewHolder holder, int position) {
        holder.pintarMolde(listarestaurantes.get(position));
    }

    @Override
    public int getItemCount() {
        return listarestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        //asocio los elementos del xml del molde
        ImageView fotorestauranteMolde;
        TextView nombrerestauranteMolde;
        TextView preciorestauranteMolde;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotorestauranteMolde=itemView.findViewById(R.id.fotomolderestaurantes);
            nombrerestauranteMolde=itemView.findViewById(R.id.nombrerestaurantesmolde);
            preciorestauranteMolde=itemView.findViewById(R.id.preciomolderestaurantes);
        }

        public void pintarMolde(restaurante restaurante) {
            fotorestauranteMolde.setImageResource(restaurante.getFoto());
            nombrerestauranteMolde.setText(restaurante.getNombre());
            preciorestauranteMolde.setText(restaurante.getPrecio());

            //Quiero escuchar clic en cada uno de los elementos de
            //la lista
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), restaurantesampliados.class);
                    intent.putExtra("datosrestaurantes",restaurante);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}
