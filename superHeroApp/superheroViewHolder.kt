package com.alumaster.androidalu.superHeroApp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.alumaster.androidalu.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class superheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(superheroItemResponse: SuperheroItemResponse, onItemSelected:(String)->Unit) {

        binding.tvHeroName.text = superheroItemResponse.name
        Picasso.get().load(superheroItemResponse.superheroImage.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener { onItemSelected(superheroItemResponse.superheroId) }



    }

}