package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        WebView webView = findViewById(R.id.webView);
        // 기본적인 웹뷰에 대한 setting , 자바 스크립트가 동작되고 있는 페이지?
        webView.getSettings().setJavaScriptEnabled(true); // 자바 스크립트 구문을 허용한다.
        webView.addJavascriptInterface(new BridgeInterface(), "Android");
        webView.setWebViewClient(new WebViewClient(){
            @Override //page 모든 로딩이 끝낫을때
            public void onPageFinished(WebView view, String url) {
                // Android -> Javascript 함수 호출!
                webView.loadUrl("javascript:sample2_execDaumPostcode();");
            }
        });

        // 최초 웹뷰
        webView.loadUrl("https://searchaddress-2c847.web.app");

    }

    private class BridgeInterface {
        @JavascriptInterface
        public void processDATA(String data){
            // 다음(카카오) 주소 검색 API의 결과 값이 브릿지 통로를 통해 전달 받음 ( from Javascript)
            Intent intent = new Intent();
            intent.putExtra("data", data);
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}