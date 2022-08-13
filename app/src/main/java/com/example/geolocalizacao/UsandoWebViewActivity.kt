package com.example.geolocalizacao

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_usando_web_view.*

class UsandoWebViewActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usando_web_view)

        /*
        * Trabalhando com o webView
        * nas proximas linhas podemos ver o tratamento necessario para trabalhar com web wiew
        * */
        webview!!.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String?
            ): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        webview!!.settings.javaScriptEnabled = true
        webview!!.loadUrl("https://www.fiap.com.br")
    }
}