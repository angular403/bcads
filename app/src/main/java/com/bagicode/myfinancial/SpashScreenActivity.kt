package com.bagicode.myfinancial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_spash_screen.*

class SpashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash_screen)

        button.setOnClickListener {
            finish()
            startActivity(Intent(this, BoardingOneActivity::class.java))
        }
    }
}
