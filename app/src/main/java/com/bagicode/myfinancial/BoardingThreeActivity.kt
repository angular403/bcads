package com.bagicode.myfinancial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_boarding_three.*

class BoardingThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boarding_three)

        button2.setOnClickListener {
            finish()
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}
