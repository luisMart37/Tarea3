package com.upv.luissoyyo.tarea3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//constructor del padre
        setContentView(R.layout.activity_main);//layout correspondiente
    }
    public void pulsadoBoton1(View view){
        Log.d("prueba", "Pulsado boton 1");
        //creamos la intención de abrir la Activity2
        Intent intencion1 = new Intent(this, Activity2.class);
        //Log.d("prueba","pasa por encima del intent");
        //arrancamos la intención de abrir Activity2, de la que esperamos
        //un resultado. La reconoceremos con el índice 1
        super.startActivityForResult(intencion1,1);
    }//pulsadoBoton1
    public void pulsadoBoton2(View view){
        Log.d("prueba", "Pulsado boton 2");
    }//pulsadoBoton2
}