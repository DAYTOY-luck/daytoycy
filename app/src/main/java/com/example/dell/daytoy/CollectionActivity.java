package com.example.dell.daytoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CollectionActivity extends AppCompatActivity {
    private WebView ccWvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collection_layout);
        ccWvMain = (WebView) findViewById(R.id.wv);
        ccWvMain.getSettings().setJavaScriptEnabled(true);
        ccWvMain.setWebViewClient(new WebViewClient());
        ccWvMain.loadUrl("https://weibo.com/u/2089358175");
    }
}
