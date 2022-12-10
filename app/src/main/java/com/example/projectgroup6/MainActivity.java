package com.example.projectgroup6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSave, btnNext;
    private EditText editName, editLastname, editEmail;
    private TextView textName, textLastname, textEmail, textFullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave = (Button) findViewById(R.id.btnSave);
        btnNext = (Button) findViewById(R.id.btnNext);

        editName = (EditText) findViewById(R.id.editName);
        editLastname = (EditText) findViewById(R.id.editLastname);
        editEmail = (EditText) findViewById(R.id.editEmail);

        textName =(TextView) findViewById(R.id.textName);
        textLastname = (TextView) findViewById(R.id.textLastname);
        textEmail = (TextView) findViewById(R.id.textEmail);
        textFullName = (TextView) findViewById(R.id.textFullName);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            //  CONVIERTE LOS TEXTOS EN ENTEROS Y LUEGO LOS SUMA
            //  int  nomUser = Integer.parseInt(editName.getText().toString().trim());
            //  int apeUser = Integer.parseInt(editLastname.getText().toString().trim());
            //  int nomcompleto = nomUser + apeUser;

            //  CONCATENA LOS TEXTOS DE LAS CAJAS
                String nomUser = editName.getText().toString().trim();
                String apeUser = editLastname.getText().toString().trim();
                String email = editEmail.getText().toString().trim();

                String fullName = nomUser + " " + apeUser + "\n" + email;

                textFullName.setText(fullName);

                Toast toast = Toast.makeText(getApplicationContext(), "Guardado", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);

            }
        });
    }
}