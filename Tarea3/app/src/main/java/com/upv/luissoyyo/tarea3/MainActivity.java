package com.upv.luissoyyo.tarea3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pulsadoBoton1(View view){
        Log.d("prueba", "Pulsado boton 1");
        //Intent intencion1 = new Intent(this, Main2Activity.class);
    }//pulsadoBoton1
    public void pulsadoBoton2(View view){
        Log.d("prueba", "Pulsado boton 2");
    }//pulsadoBoton2
}