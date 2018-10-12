package com.example.utsha.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SecondActivity extends AppCompatActivity {

    WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        wb = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = wb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("http://www/facebook.com");

    }

    @Override
    public void onBackPressed() {
        if(wb.canGoBack())
            wb.goBack();
        else
        super.onBackPressed();
    }
}
