package com.example.user.editweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.webkit.WebViewClient;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String a1, b1, c1, str;
    int X;
    Button btn;
    EditText ET1, ET2, ET3;
    WebView webV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webV.getSettings().setJavaScriptEnabled(true);
        webV.setWebViewClient(new MyWebViewClient());
        webV = (WebView) findViewById(R.id.webV);
        btn = (Button) findViewById(R.id.btn);
        ET1 = (EditText) findViewById(R.id.ET1);
        ET2 = (EditText) findViewById(R.id.ET2);
        ET3 = (EditText) findViewById(R.id.ET3);
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }


      public void Solution(View view) {
        str = "https://www.google.com/search?q=";
        a1 = ET1.getText().toString();
        b1 = ET2.getText().toString();
        c1 = ET3.getText().toString();
        X = Integer.parseInt(a1);
        if (X == 0)
            Toast.makeText(this, "This value can not be used", Toast.LENGTH_SHORT).show();
        else {
            str = str + a1 + "x%5E2%2B" + b1 + "x%2B" + c1;
            webV.loadUrl(str);
        }
    }


}



