package com.example.dell.daytoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ContributionActivity extends AppCompatActivity {

    private WebView cWvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contribution_layout);
        cWvMain = (WebView) findViewById(R.id.wv);
        cWvMain.getSettings().setJavaScriptEnabled(true);
        cWvMain.setWebViewClient(new WebViewClient());
        cWvMain.loadUrl("https://m.weibo.cn/pages/231642_hotdonate/qq?uid=3722789161&wm=9856_0004&from=10A3195010&sourcetype=qq");
    }
}
