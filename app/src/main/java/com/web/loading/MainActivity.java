package com.web.loading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter = findViewById(R.id.fb_webview);
        WebSettings webSettings = enter.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //enter.loadUrl("https://m.facebook.com/");
        enter.loadUrl("https://www.52pojie.cn/");
        enter.setWebViewClient(new WebViewClient());
    }

    @Override   //enable the back button
    public void onBackPressed() {
        if (enter.canGoBack()) {
            enter.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
