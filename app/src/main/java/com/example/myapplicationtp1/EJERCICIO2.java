package com.example.myapplicationtp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EJERCICIO2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
    }
    public void volverMAIN (View view)
    {
        Intent MAIN = new Intent(this, MainActivity.class);
        startActivity(MAIN);
    }
}