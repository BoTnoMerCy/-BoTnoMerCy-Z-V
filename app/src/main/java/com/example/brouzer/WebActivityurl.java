package com.example.brouzer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebActivityurl extends AppCompatActivity {
    private WebView WebView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weburl);
        WebView = findViewById(R.id.webView);
        WebSettings webSet = WebView.getSettings();
        webSet.setJavaScriptEnabled(true);
        WebView.setWebViewClient(new WebViewClient());

        Intent intent =getIntent();

        String url = intent.getStringExtra("url");

        WebView.loadUrl(url);

    }
    @Override
    public void onBackPressed(){
        if (WebView.canGoBack()){
            WebView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
