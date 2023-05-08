package com.alumaster.androidalu.primerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.alumaster.androidalu.R
import com.alumaster.androidalu.primerapp.CalcuAppActivity.Companion.imcCalcuPw

class imcCalcu : AppCompatActivity() {

    private lateinit var tvImc:TextView
    private lateinit var tvImc2:TextView
    private lateinit var tvImc3:TextView
    private lateinit var btnRecalculate:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calcu)
        val result:Double = intent.extras?.getDouble(imcCalcuPw) ?: -1.0
        initComponents()
        initUI(result)
        initListeners()

    }

    private fun initListeners() {
        btnRecalculate . setOnClickListener { onBackPressed() }


    }

    private fun initUI(result:Double) {
        tvImc.text = result.toString()
        when (result){
            in 0.00..18.50-> {

                tvImc2.text =getString(R.string.imc2BajoPeso)
                tvImc3.text=getString(R.string.imc3BajoPeso)

            }
            in 18.51..24.99-> {

                tvImc2.text=getString(R.string.imc2Normal)
                tvImc3.text=getString(R.string.imc3PesoNormal)
        }
            in 24.99..99.99-> {

                tvImc2.text=getString(R.string.imc2PesoAlto)
                tvImc3.text=getString(R.string.imc3PesoAlto)
    }else -> {
        //error
            tvImc.text =getString(R.string.Error)
            tvImc2.text=getString(R.string.Error)
            tvImc3.text=getString(R.string.Error)
    }

        }
        }

    private fun initComponents() {
        tvImc =findViewById(R.id.tvImc)
        tvImc2 = findViewById(R.id.tvImc2)
        tvImc3 = findViewById(R.id.tvImc3)
        btnRecalculate = findViewById(R.id.btnRecalculate)


    }

}