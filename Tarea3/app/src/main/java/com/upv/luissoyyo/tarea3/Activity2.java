package com.upv.luissoyyo.tarea3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("prueba","entra en la funcion onCreate de Main2");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}