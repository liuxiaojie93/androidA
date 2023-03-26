package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
public class WebViewTest extends Activity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        Intent indent = getIntent();
        Bundle reBd = indent.getExtras();
        String url = (reBd.getString("url"));
        System.out.println(url);
        WebView wb = (WebView) findViewById(R.id.webview);
        WebSettings settings = wb.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
//        wb.setWebChromeClient(new WebChromeClient());
        wb.setWebViewClient(new webViewKit() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });
        wb.loadUrl(url);

    }
}
