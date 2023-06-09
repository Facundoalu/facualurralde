package com.alumaster.androidalu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.alumaster.androidalu.primerapp.CalcuAppActivity
import com.alumaster.androidalu.primerapp.PrimerAppActivity
import com.alumaster.androidalu.settings.SettingsActivity
import com.alumaster.androidalu.superHeroApp.SuperHeroListActivity
import com.alumaster.androidalu.toDoApp.ToDoActivity

class MenuPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        val btnToDo = findViewById<Button>(R.id.btnToDo)
        btnToDo.setOnClickListener { navigateToToDoApp() }

        val btnSaludo = findViewById<Button>(R.id.btnSaludo)
        btnSaludo.setOnClickListener { navigateToSaludo() }

        val btnCalcu = findViewById<Button>(R.id.btnCalculador)
        btnCalcu.setOnClickListener { navigateToCalcuAppActivity() }

        val btnSuperHero = findViewById<Button>(R.id.btnSuperHero)
        btnSuperHero.setOnClickListener { navigatetoSuperHeroApp() }

        val btnSettings = findViewById<Button>(R.id.btnSettings)
        btnSettings.setOnClickListener { navigateToSettings() }


    }

    private fun navigateToSettings() {
        val intent = Intent (this, SettingsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToToDoApp() {
        val intent = Intent(this, ToDoActivity::class.java)
        startActivity(intent)
    }

    fun navigateToCalcuAppActivity() {
        val intent = Intent(this, CalcuAppActivity::class.java)
        startActivity(intent)
    }

    fun navigateToSaludo() {

        val intent = Intent(this, PrimerAppActivity::class.java)
        startActivity(intent)
    }

    fun navigatetoSuperHeroApp() {
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }
}