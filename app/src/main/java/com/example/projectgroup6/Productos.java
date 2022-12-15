package com.example.projectgroup6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.projectgroup6.Adaptadores.ProductoAdapter;
import com.example.projectgroup6.Entidades.Producto;

import java.util.ArrayList;

public class Productos extends AppCompatActivity {
    private Button btnVolverProductos;
    private Button btnInicioProductos;
    private ListView listViewProductos;
    private ProductoAdapter productoAdapter;
    private ArrayList<Producto> arrayProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        listViewProductos = (ListView) findViewById(R.id.listViewProductos);
        arrayProductos = new ArrayList<>();

        // productos manuales
        Producto producto1 = new Producto("Producto1", "descripcion1",1000,R.drawable.moto1);
        Producto producto2 = new Producto("Producto2", "descripcion2",2000,R.drawable.moto2);
        Producto producto3 = new Producto("Producto3", "descripcion3",3000,R.drawable.moto3);
        Producto producto4 = new Producto("Producto4", "descripcion4",4000,R.drawable.moto4);
        arrayProductos.add(producto1);
        arrayProductos.add(producto2);
        arrayProductos.add(producto3);
        arrayProductos.add(producto4);


        productoAdapter = new ProductoAdapter(this, arrayProductos);
        listViewProductos.setAdapter(productoAdapter);

        // Funciones de los Botones
        btnInicioProductos = (Button) findViewById(R.id.btnInicioProductos);

        btnInicioProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btnVolverProductos = (Button) findViewById(R.id.btnVolverProductos);

        btnVolverProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}