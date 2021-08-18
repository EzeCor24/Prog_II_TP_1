package com.example.myapplicationtp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EJERCICIO1 extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView res;
    private Button sumar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        et1=(EditText)findViewById(R.id.etNumero1);
        et2=(EditText)findViewById(R.id.etNumero2);
        res=(TextView) findViewById(R.id.txtResultado);
    }

    public void sumar(View view)
    {
        String N1 = et1.getText().toString();
        String N2 = et2.getText().toString();

        int num1 = Integer.parseInt(N1);
        int num2 = Integer.parseInt(N2);

        int suma = num1+num2;

        String resul = String.valueOf(suma);
        res.setText(resul);
    }

    public void volverMAIN (View view)
    {
        Intent MAIN = new Intent(this, MainActivity.class);
        startActivity(MAIN);
    }
}