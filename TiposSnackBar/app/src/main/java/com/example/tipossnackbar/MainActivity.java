package com.example.tipossnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnCorto,btnLargo,btnIndefinido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCorto = findViewById(R.id.buttonCorto);
        btnLargo = findViewById(R.id.buttonLargo);
        btnIndefinido = findViewById(R.id.buttonIndefinido);

        btnCorto.setOnClickListener(this);
        btnLargo.setOnClickListener(this);
        btnIndefinido.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonCorto){
            Snackbar.make(v, "Mensaje de Tipo SnackBar CORTO", Snackbar.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.buttonLargo){
            Snackbar.make(v, "Mensaje de Tipo SnackBar LARGO", Snackbar.LENGTH_LONG).show();
        }
        if(v.getId()==R.id.buttonIndefinido){
            Snackbar.make(v, "Mensaje de Tipo SnackBar INDEFINIDO", Snackbar.LENGTH_INDEFINITE).show();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }}