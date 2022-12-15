package com.example.projectgroup6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Info extends AppCompatActivity {
    private Button btnVolverInfo;
    private TextView textNameInfo, textPriceInfo, textDescriptionInfo;
    private ImageView imgInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        textNameInfo = (TextView) findViewById(R.id.textNameInfo);
        textPriceInfo = (TextView) findViewById(R.id.textPriceInfo);
        textDescriptionInfo = (TextView) findViewById(R.id.textDescriptionInfo);
        imgInfo =(ImageView) findViewById(R.id.imgInfo);

        Intent intentIN = getIntent();
        textNameInfo.setText(intentIN.getStringExtra("name"));
        textDescriptionInfo.setText(intentIN.getStringExtra("description"));
        textPriceInfo.setText(intentIN.getStringExtra("price"));
        imgInfo.setImageResource(intentIN.getIntExtra("image", 0));


        // Funciones de los botones
        btnVolverInfo = (Button) findViewById(R.id.btnVolverInfo);

        btnVolverInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Productos.class);
                startActivity(intent);
            }
        });

    }
}