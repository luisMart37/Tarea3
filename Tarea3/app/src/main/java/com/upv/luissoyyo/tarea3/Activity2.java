package com.upv.luissoyyo.tarea3;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView textSumando1, textSumando2;
    private int sumando1, sumando2, suma;
    private String stringSumando1, stringSumando2;

    //POR QUÉ PRIVATE?

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("prueba","Arranca Activity2");
        super.onCreate(savedInstanceState);//constructor del padre
        setContentView(R.layout.activity_main2);//relación de Activity2.java
        //con su layout

    }
    public void pulsadoBotonSumar(View view){
        Log.d("prueba", "pulsado el boton SUMAR");
        //vamos a leer del cuadro de texto
        textSumando1=(EditText)findViewById(R.id.editTextSumando1);
        //convertimos el texto del cuadro en una variable String: stringSumando1
        stringSumando1=textSumando1.getText().toString();
        Log.d("prueba",stringSumando1);
        sumando1=Integer.parseInt(stringSumando1);
        //repetimos las dos líneas anteriores para el cuadro 2
        textSumando2=(EditText) findViewById(R.id.editTextSumando2);
        stringSumando2=textSumando2.getText().toString();
        sumando2=Integer.parseInt(stringSumando2);
        //hacemos la suma
        suma=sumando1+sumando2;
        Log.d("prueba","El resultado de la suma es "+suma);

        //creamos el intent de respuesta
        Intent resultado = new Intent();
        //disponemos la información que vamos a pasarle a MainActivity
        resultado.putExtra("SumaHecha",suma);
        //convertimos esta intencion en el resultado final de la actividad
        setResult(RESULT_OK,resultado);
        finish();//acabamos la actividad
    }//pulsadoBotonSumar

}