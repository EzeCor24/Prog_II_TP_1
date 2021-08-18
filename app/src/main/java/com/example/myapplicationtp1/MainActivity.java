package com.example.myapplicationtp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejercicio1 (View view)
    {
        Intent ej1 = new Intent(this, EJERCICIO1.class);
        startActivity(ej1);
    }

    public void ejericio2 (View view)
    {
        Intent ej2 = new Intent(this, EJERCICIO2.class);
        startActivity(ej2);
    }


}