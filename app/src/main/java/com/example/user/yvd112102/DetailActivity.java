package com.example.user.yvd112102;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class DetailActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        wv = (WebView) findViewById(R.id.webView);
        Intent it = getIntent();
        String str_url = it.getStringExtra("str_url");
        wv.setWebChromeClient(new WebChromeClient());
        wv.loadUrl(str_url);
    }
}