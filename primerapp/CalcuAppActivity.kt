package com.alumaster.androidalu.primerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.alumaster.androidalu.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class CalcuAppActivity : AppCompatActivity() {
    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false
    private var currentWeight = 60
    private var currentAge = 30
    private var currentHeight: Int = 120
    private lateinit var cardMale: CardView
    private lateinit var cardFemale: CardView
    private lateinit var txtAltura: TextView
    private lateinit var rangeSlider: RangeSlider
    private lateinit var btnAdd: FloatingActionButton
    private lateinit var btnSubstract: FloatingActionButton
    private lateinit var txtPeso: TextView
    private lateinit var btnAddAge: FloatingActionButton
    private lateinit var btnSubstractAge: FloatingActionButton
    private lateinit var txtAge: TextView
    private lateinit var btnCalculate: Button

    companion object{
        const val imcCalcuPw = "IMCCALCU"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcu_app)
        initComponent()
        initListener()
        initUI()
    }

    private fun initComponent() {                        //"Declarar los botones a la logica
        cardMale = findViewById(R.id.cardMale)
        cardFemale = findViewById(R.id.cardFemale)
        txtAltura = findViewById(R.id.txtAltura)
        rangeSlider = findViewById(R.id.rangeSlider)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubstract = findViewById(R.id.btnSubstract)
        txtPeso = findViewById(R.id.txtPeso)
        btnAddAge = findViewById(R.id.btnaddAge)
        btnSubstractAge = findViewById(R.id.btnSubstractAge)
        txtAge = findViewById(R.id.txtAge)
        btnCalculate = findViewById(R.id.btnCalculate)
    }

    private fun calculateIMC():Double {
        val df = DecimalFormat("#.##")

        val imc = currentWeight / (currentHeight.toDouble() / 100 * currentHeight.toDouble() / 100)

        return df.format(imc).toDouble()
    }

    private fun setAge() {
        txtAge.text = currentAge.toString()
    }

    private fun setWeight() {
        txtPeso.text = currentWeight.toString()
    }

    private fun initListener() {                             //Si lo apretaste o no
        cardMale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        cardFemale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        rangeSlider.addOnChangeListener { _, value, _ ->

            val dF = DecimalFormat("#.##")
            currentHeight = dF.format(value).toInt()
            txtAltura.text = "$currentHeight cm"

            btnAdd.setOnClickListener {
                currentWeight += 1
                setWeight()
            }
            btnSubstract.setOnClickListener {
                currentWeight -= 1
                setWeight()
            }
            btnAddAge.setOnClickListener {
                currentAge += 1
                setAge()
            }
            btnSubstractAge.setOnClickListener {
                currentAge -= 1
                setAge()
            }
        }
        btnCalculate.setOnClickListener {
            val result = calculateIMC()
            navigateCalculate(result)
        }
    }

    private fun navigateCalculate(result: Double) {
        val intent =Intent (this, imcCalcu::class.java)

        intent.putExtra(imcCalcuPw, result)

        startActivity(intent)
    }


    private fun changeGender() {

        isMaleSelected = !isMaleSelected

        isFemaleSelected = !isFemaleSelected

    }

    private fun setGenderColor() {

        cardFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))

        cardMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))

    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {

        val colorReference = if (isSelectedComponent) {
            androidx.appcompat.R.color.background_material_light
        } else {
            androidx.constraintlayout.widget.R.color.background_material_dark
        }

        return ContextCompat.getColor(this, colorReference)


    }

    private fun initUI() {
        setGenderColor()
        setAge()
        setWeight()

    }


}
