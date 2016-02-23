package com.upv.luissoyyo.tarea3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//constructor del padre
        setContentView(R.layout.activity_main);//layout correspondiente
        //relacionamos el widget de texto xml con la variable java
        textResultado=(TextView)findViewById(R.id.textResult);
        //dejamos el texto vacío hasta que se haga la suma
        this.textResultado.setText(null);
    }

    public void pulsadoBoton1(View view){
        Log.d("prueba", "Pulsado boton 1");
        //creamos la intención de abrir la Activity2
        Intent intencion1 = new Intent(this, Activity2.class);
        //Log.d("prueba","pasa por encima del intent");

        //arrancamos la Activity2, de la que esperamos
        //un resultado. La reconoceremos con el índice 1
        super.startActivityForResult(intencion1, 1);
    }//pulsadoBoton1

    public void pulsadoBoton2(View view){
        Log.d("prueba", "Pulsado boton 2");
        //creamos la intencion 2 que irá a Activity2 de forma implicita
        Intent intencion2 = new Intent("luis.ACTIVITY2");
        //ejecutamos intencion 2 y será reconocida con el índice 2
        this.startActivityForResult(intencion2,2);
    }//pulsadoBoton2

    protected void onActivityResult(int codigoLlamada,int codigoResultado,Intent intentRespuesta){

        if(codigoLlamada==1) {//si la actividad que ha terminado es la 1 (codigo de la llamada)
            int mostraremos = intentRespuesta.getExtras().getInt("SumaHecha");
            this.textResultado.setText("El resultado es: "+mostraremos);
        }
        if(codigoLlamada==2) {//si la actividad que ha terminado es la 2 (codigo de la llamada)
            int mostraremos = intentRespuesta.getExtras().getInt("SumaHecha");
            this.textResultado.setText("El resultado es: "+mostraremos);
        }
    }//onActivityResult
}