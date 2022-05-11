package com.example.sibyglobal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.getSettings().setLoadsImagesAutomatically(true);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("http://sibyglobal.lescigales.org/");
    }
}