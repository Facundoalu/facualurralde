package com.alumaster.androidalu.primerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alumaster.androidalu.R

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val textEj = findViewById<TextView>(R.id.textEj)

        val nombre:String =intent.extras?.getString("NOMBRE").orEmpty()

        textEj.text="holis $nombre"

    }
}