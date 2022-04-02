package com.example.brouzer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class WebActivity6 extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    private EditText url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web6);

        url = (EditText) findViewById(R.id.edit);

    }

    public void goWeb(View view) {
        Intent intent = new Intent(this, WebActivityurl.class);
        intent.putExtra("url", url.getText().toString());
        startActivity(intent);
    }
}
