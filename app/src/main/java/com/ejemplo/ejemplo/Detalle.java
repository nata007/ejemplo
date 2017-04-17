package com.ejemplo.ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import com.ejemplo.ejemplo.Adapters.DatosAdapter;
import com.ejemplo.ejemplo.Structs.Datos;

import java.util.ArrayList;
import java.util.List;

public class Detalle extends AppCompatActivity {
    RecyclerView recycler;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);


        List datos = new ArrayList();

        datos.add(new Datos("Pedro Joaqion"));
        datos.add(new Datos("Carlos espejel"));
        datos.add(new Datos("Natanael Chávez"));

        recycler = (RecyclerView) findViewById(R.id.Reciclador);
        recycler.setHasFixedSize(true);

        manager = new LinearLayoutManager(Detalle.this);
        recycler.setLayoutManager(manager);
        adapter = new DatosAdapter(datos);
        recycler.setAdapter(adapter);



    }
}
