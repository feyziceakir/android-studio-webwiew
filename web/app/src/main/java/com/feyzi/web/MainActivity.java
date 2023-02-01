package com.feyzi.web;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bagla();
        yukle();
        webView.setWebViewClient(new WebViewClient());
    }
    public void bagla(){
        webView=findViewById(R.id.web);
    }
    public void yukle() {
        webView.loadUrl("buraya gelmesini istediğimiz linki yazın");//buraya gelmesini istediğimiz urlyi yazıyoruz
        webView.getSettings().setJavaScriptEnabled(true);

    }
}
