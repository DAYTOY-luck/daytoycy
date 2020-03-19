package com.example.dell.daytoy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    private WebView mWvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view_layout);
        mWvMain = (WebView) findViewById(R.id.wv);
        mWvMain.getSettings().setJavaScriptEnabled(true);
        mWvMain.setWebViewClient(new WebViewClient());
        mWvMain.loadUrl("https://news.cctv.com/");   //央视新闻
    }
}