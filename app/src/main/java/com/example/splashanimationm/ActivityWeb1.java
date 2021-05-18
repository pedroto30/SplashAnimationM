package com.example.splashanimationm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb1 extends AppCompatActivity {
    private WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web1);
        webView1 = (WebView) findViewById(R.id.webView1);

        WebSettings webSettings1 = webView1.getSettings();
        webView1.getSettings().setLoadsImagesAutomatically(true);
        webSettings1.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView1.loadUrl("http://www.youtube.com");
    }

    @Override
    public void onBackPressed() {
        if (webView1.canGoBack()){
            webView1.goBack();
        }else {
            super.onBackPressed();}
    }
}