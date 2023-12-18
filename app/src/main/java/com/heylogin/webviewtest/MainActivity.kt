package com.heylogin.webviewtest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebViewClient
import com.heylogin.webviewtest.databinding.WebviewLayoutBinding

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = WebviewLayoutBinding.inflate(layoutInflater)

        binding.webview.loadUrl("https://fill.dev/form/login-simple")
        val webSettings: WebSettings = binding.webview.settings
        binding.webview.webViewClient = WebViewClient()
        webSettings.javaScriptEnabled = true

        setContentView(binding.root)
    }
}