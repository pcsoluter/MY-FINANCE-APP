package com.mahesh.moneyplanner;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.view.ViewGroup;
import android.graphics.Color;
public class MainActivity extends Activity {
 private WebView webView;
 @Override public void onCreate(Bundle b){super.onCreate(b);getWindow().setStatusBarColor(Color.rgb(16,29,51));getWindow().setNavigationBarColor(Color.rgb(16,29,51));webView=new WebView(this);webView.setLayoutParams(new ViewGroup.LayoutParams(-1,-1));WebSettings w=webView.getSettings();w.setJavaScriptEnabled(true);w.setDomStorageEnabled(true);w.setDatabaseEnabled(true);webView.setWebViewClient(new WebViewClient());webView.setWebChromeClient(new WebChromeClient());setContentView(webView);webView.loadUrl("file:///android_asset/www/index.html");}
 @Override public void onBackPressed(){if(webView!=null&&webView.canGoBack())webView.goBack();else super.onBackPressed();}
}
