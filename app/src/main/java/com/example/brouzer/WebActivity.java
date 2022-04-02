package com.example.brouzer;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebActivity extends AppCompatActivity {
    private WebView WebView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView = findViewById(R.id.webView);
        WebSettings webSet = WebView.getSettings();
        webSet.setJavaScriptEnabled(true);
        WebView.loadUrl("https://www.ozon.ru/");
        WebView.setWebViewClient(new WebViewClient());
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
