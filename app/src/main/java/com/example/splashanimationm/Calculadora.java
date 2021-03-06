package com.example.splashanimationm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora extends AppCompatActivity {
    //Declarar variables globales para los controles
    EditText et1, et2, etresultado;
    Button btnsumar, btnrestar, btnmultiplicar, btndividir, btnsalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
//Escuchar los controles de la vista
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        etresultado = (EditText) findViewById(R.id.etresultado);
        btnsumar = (Button) findViewById(R.id.btnsumar);
        btnrestar = (Button) findViewById(R.id.btnrestar);
        btnmultiplicar = (Button) findViewById(R.id.btnmultiplicar);
        btndividir = (Button) findViewById(R.id.btndividir);
        btnsalir = (Button) findViewById(R.id.btnsalir);
        //Proceso del Evento
        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sumar();
            }

        });
        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Restar();
            }
        });
        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiplicar();
            }
        });
        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dividir();
            }
        });
        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
                et2.setText("");
                etresultado.setText("");
                Intent intent = new Intent(Calculadora.this, Login.class);
                startActivity(intent);
            }
        });
    }
    /*private void Salir(View view) {

    }*/
    private void Sumar() {
        double nro1 = Double.valueOf(et1.getText().toString());
        double nro2 = Double.valueOf(et2.getText().toString());
        double suma= nro1 + nro2;
        etresultado.setText(String.valueOf(suma));
    }
    private void Restar() {
        double nro1 = Double.valueOf(et1.getText().toString());
        double nro2 = Double.valueOf(et2.getText().toString());
        double resta= nro1 - nro2;
        etresultado.setText(String.valueOf(resta));
    }
    private void Multiplicar() {
        double nro1 = Double.valueOf(et1.getText().toString());
        double nro2 = Double.valueOf(et2.getText().toString());
        double multiplicar= nro1 * nro2;
        etresultado.setText(String.valueOf(multiplicar));
    }
    private void Dividir() {
        double nro1 = Double.valueOf(et1.getText().toString());
        double nro2 = Double.valueOf(et2.getText().toString());
        if (nro2 == 0)
            etresultado.setText("Error Divici??n Entre 0");
        else {
            double divicion= nro1 / nro2;
            etresultado.setText(String.valueOf(divicion));
        }
    }
}