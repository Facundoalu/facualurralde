package com.alumaster.androidalu.superHeroApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.View
import androidx.core.view.isVisible
import com.alumaster.androidalu.R
import com.alumaster.androidalu.databinding.ActivityDetailSuperheroBinding
import com.squareup.picasso.Picasso
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.math.roundToInt




class DetailSuperheroActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_ID = "extra_id"
    }

    private lateinit var binding: ActivityDetailSuperheroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailSuperheroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_detail_superhero)
        val id: String = intent.getStringExtra(EXTRA_ID).orEmpty()
        getSuperheroInformation(id)
    }

    private fun getSuperheroInformation(id: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val superheroDetail =
                getRetrofit().create(ApiService::class.java).getSuperheroDetail(id)

            if (superheroDetail.body() != null) {
                runOnUiThread { createUI(superheroDetail.body()!!) }

            }
        }
    }

    private fun createUI(superhero: superheroDetailResponse) {
        Picasso.get().load(superhero.image.url).into(binding.ivSuperheroDetail)
        binding.tvSuperheroName.text = superhero.name
        prepareStats(superhero.powerstats)

    }

    private fun prepareStats(powerstats: powerStatsResponse) {
        updateHeight(binding.vCombat, powerstats.combat)
        updateHeight(binding.vDurability, powerstats.durability)
        updateHeight(binding.vSpeed, powerstats.speed)
        updateHeight(binding.vStrenght, powerstats.strenght)
        updateHeight(binding.vIntelligence, powerstats.intelligence)
        updateHeight(binding.vPower, powerstats.power)

    }


}

private fun updateHeight(view: View, stat: String) {
    val params = view.layoutParams
    params.height = pxToDp(stat.toFloat())
    view.layoutParams = params
}

private fun pxToDp(px: Float): Int {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, px, resources.DisplayMetrics).roundToInt()
}

private fun getRetrofit(): Retrofit {
    return Retrofit
        .Builder()
        .baseUrl("https://superheroapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}

private fun searchbyName(query: String) {
    CoroutineScope(Dispatchers.IO).launch {
    }
}
