package com.alumaster.androidalu.primerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.alumaster.androidalu.R

class PrimerAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primer_app)

        val etName = findViewById<AppCompatEditText>(R.id.etName)

        val botonStart=findViewById<AppCompatButton>(R.id.btnStart)
            botonStart.setOnClickListener {

                val nombre = etName.text.toString()

                if (nombre.isNotEmpty()) {
                    val intent=Intent(this, Resultado::class.java)
                    intent.putExtra("NOMBRE", nombre)
                    startActivity(intent)
                }
            }

        //Aca arranca la pantalla
    }
}