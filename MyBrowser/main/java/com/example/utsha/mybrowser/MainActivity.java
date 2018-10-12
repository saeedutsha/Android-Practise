package com.example.utsha.mybrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wb = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = wb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("http://www.youtube.com");
    }

    @Override
    public void onBackPressed() {
        if(wb.canGoBack())
            wb.goBack();
        else
            super.onBackPressed();
    }
}
