package com.example.projectgroup6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button btnVolver;
    private Button btnMotos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //aqui enlazamos el boton con la parte grafica
        btnVolver = (Button) findViewById(R.id.btnVolver);

        //funcion al presionar le boton
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btnMotos = (Button) findViewById(R.id.btnMotos);

        btnMotos.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(getApplicationContext(), Productos.class);
                 startActivity(intent);
            }
        });
    }
}