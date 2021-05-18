package com.example.splashanimationm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Multimedia extends AppCompatActivity {
    ImageButton btnGato, btnPerro, btnPayaso;
    ImageView imgFondo;
    MediaPlayer ladra, miau, risas, reproductor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia);
        btnGato = (ImageButton) findViewById(R.id.btnGato);
        btnPerro = (ImageButton) findViewById(R.id.btnPerro);
        btnPayaso = (ImageButton) findViewById(R.id.btnPayaso);
        imgFondo = (ImageView) findViewById(R.id.imgFondo);



        //Reproducir el MP3
        btnGato.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Maullar();
                imgFondo.setImageResource(R.drawable.gato);
            }
        });
        btnPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ladrar();
                imgFondo.setImageResource(R.drawable.perro);
            }
        });
        btnPayaso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Payaso();
                imgFondo.setImageResource(R.drawable.payaso);
            }
        });
    }
    private void Maullar(){
        MediaPlayer mpGato = MediaPlayer.create( Multimedia.this, R.raw.miau);
        mpGato.start();
    }
    private void Ladrar(){
        MediaPlayer mpPerro = MediaPlayer.create( Multimedia.this, R.raw.ladra);
        mpPerro.start();
    }

    private void Payaso() {
        MediaPlayer mpPayaso = MediaPlayer.create(Multimedia.this, R.raw.risas);
        mpPayaso.start();
    }
    /*@Override
    protected void onDestroy(){
        super.onDestroy();
        if (reproductor1.isPlaying())
        {
            reproductor1.stop();
            reproductor1.release();
        }
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        reproductor1.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        reproductor1.pause();
    }*/


}