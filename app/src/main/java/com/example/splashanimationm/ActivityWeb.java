package com.example.splashanimationm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class ActivityWeb extends AppCompatActivity {
    private WebView webView;
    //EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        //et1 = (EditText)findViewById(R.id.txt_web);
        webView = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = webView.getSettings();
        webView.getSettings().setLoadsImagesAutomatically(true);
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl("http://www.google.com");

    }

    /*public void Navegar(View view) {
        //se establecen cambios de pantallas o activitys
        Intent i = new Intent(this, ActivityWeb1.class);
        //enviar parametros intent , metodo put extra
        i.putExtra("SitioWeb" , et1.getText().toString());
        startActivity(i);

    }*/

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }else {
        super.onBackPressed();}
    }
}