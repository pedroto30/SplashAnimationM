package com.example.splashanimationm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.net.URLEncoder;

public class Login extends AppCompatActivity {
    Button btnApk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        btnApk=(Button)findViewById(R.id.btnApk);

    btnApk.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                Uri google = Uri.parse("http://www.youtube.com");
                Intent intent = new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);
            }
            catch (Exception e){System.out.println("Error "+e);}

        }

    });
    }

    public void login(View view) {
        Intent intent = new Intent(Login.this, Calculadora.class);
        startActivity(intent);
    }

    public void crearCuenta(View view) {
        Intent i = new Intent(Login.this, CrearCuenta.class);
        startActivity(i);
    }

    public void Multimedia(View view) {
        Intent intent = new Intent(Login.this, Multimedia.class);
        startActivity(intent);
    }

    public void web(View view) {
        Intent intent = new Intent(Login.this, ActivityWeb.class);
        startActivity(intent);
    }

    public void llamar(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL,
                Uri.parse("tel:952000243"));
        startActivity(intent);
    }

    public void Whatsapp(View view) {
        PackageManager packageManager = this.getPackageManager();
        Intent i = new Intent(Intent.ACTION_VIEW);
        try {
            String url = "https://api.whatsapp.com/send?phone=" + "+51986890070" + "&text="
                    + URLEncoder.encode("Buen día, tenia una duda del curso ... ", "UTF-8");
            i.setPackage("com.whatsapp");
            i.setData(Uri.parse(url));
            if (i.resolveActivity(packageManager) != null) {
                this.startActivity(i);
            }
            else {
                Toast.makeText(this, "No tiene Whatsapp porfavor instale la app"
                        , Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void salir(View view) {
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setMessage("Esta seguro que quiere salir?");
        builder.setTitle("Click");
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Login.this, MainActivity2.class);
                startActivity(intent);
                //finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialog=builder.create();
        dialog.show();
    }
}