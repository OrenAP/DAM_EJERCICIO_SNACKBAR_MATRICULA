package com.example.listview_matricula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnFinalizar;
    ListView lista;
    List<String> estudiantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Matricula");

        // 1. Conectamos nuestro listView a lista a través del id
        lista = findViewById(R.id.listviewCursos);
        // 2. Instanciamos la Lista y agregamos elementos
        estudiantes = new ArrayList<>();
        estudiantes.add("Sistemas Operativos");
        estudiantes.add("Sistemas de Informacion");
        estudiantes.add("Arquitectura de Computadoras");
        estudiantes.add("Big Data");
        estudiantes.add("Desarrollo de Aplicaciones Moviles");
        // 3. Definir el Adaptador
        ArrayAdapter adaptadorEstudiantes = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                estudiantes
        );
        // 4. Vinculamos el Adaptador con el listView
        lista.setAdapter(adaptadorEstudiantes);
        btnFinalizar = findViewById(R.id.buttonFinalizar);
        btnFinalizar.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonFinalizar) {
            Toast.makeText(this, "Matricula Completa", Toast.LENGTH_SHORT).show();
        }

    }}