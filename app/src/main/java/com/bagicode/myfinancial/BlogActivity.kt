package com.bagicode.myfinancial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_blog.*

class BlogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        Toast.makeText(this, "Please Wait ... ", Toast.LENGTH_SHORT).show()

        webview.loadUrl("https://www.google.com/")
        webview.settings.javaScriptEnabled

    }
}
