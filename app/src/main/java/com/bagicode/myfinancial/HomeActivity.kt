package com.bagicode.myfinancial

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        textView12.setOnClickListener {
            startActivity(Intent(this, BlogActivity::class.java))
        }
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Konfirmasi")
            .setMessage("Apakah Anda yakin ingin keluar?")
            .setPositiveButton("Ya", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "Terimakasih telah menggunakan Aplikasi My Financial",
                    Toast.LENGTH_LONG).show()
                finish()

            })
            .setNegativeButton("Batal", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            .show()
    }
}
