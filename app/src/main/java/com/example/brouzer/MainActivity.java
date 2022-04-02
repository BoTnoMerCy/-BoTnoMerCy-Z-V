package com.example.brouzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goWeburl(View view) {
        Intent intent = new Intent(this, WebActivity6.class);
        startActivity(intent);
    }
    public void goWeb(View view) {
        Intent intent = new Intent(this, WebActivity.class);
        startActivity(intent);
    }

    public void goWeb1(View view) {
        Intent intent = new Intent(this, WebActivity1.class);
        startActivity(intent);
    }

    public void goWeb2(View view) {
        Intent intent = new Intent(this, WebActivity2.class);
        startActivity(intent);
    }

    public void goWeb3(View view) {
        Intent intent = new Intent(this, WebActivity3.class);
        startActivity(intent);
    }

    public void goWeb4(View view) {
        Intent intent = new Intent(this, WebActivity4.class);
        startActivity(intent);
    }

    public void goWeb5(View view) {
        Intent intent = new Intent(this, WebActivity5.class);
        startActivity(intent);

    }


}
