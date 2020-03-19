package com.example.dell.daytoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DynamicActivity extends AppCompatActivity {

    private WebView dWvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dynamic_layout);
        dWvMain = (WebView) findViewById(R.id.wv);
        dWvMain.getSettings().setJavaScriptEnabled(true);
        dWvMain.setWebViewClient(new WebViewClient());
        dWvMain.loadUrl("https://weibo.com/tv/v/ItdsTAmQ4?fid=1034:4469631524470801");
    }
}
