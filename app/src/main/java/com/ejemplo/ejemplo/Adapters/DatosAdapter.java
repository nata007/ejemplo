package com.ejemplo.ejemplo.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ejemplo.ejemplo.R;
import com.ejemplo.ejemplo.Structs.Datos;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by macbookprolate2011 on 17/04/17.
 */

public class DatosAdapter extends RecyclerView.Adapter<DatosAdapter.DatosAdapterHolder> {

    public List<Datos> datos;

    public DatosAdapter(List<Datos> datos) {
        this.datos = datos;
    }

    @Override
    public DatosAdapterHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);


        return new DatosAdapterHolder(v);
    }

    @Override
    public void onBindViewHolder(DatosAdapterHolder holder, int position) {

        holder.nombre.setText(datos.get(position).getNombre());

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }


    public class DatosAdapterHolder extends RecyclerView.ViewHolder{
        TextView nombre;

        public DatosAdapterHolder(View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.nombre_card);
        }
    }
}
