package com.alumaster.androidalu.superHeroApp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alumaster.androidalu.R

class SuperheroAdapter(
    var superheroList: List<SuperheroItemResponse> = emptyList(),
    private val onItemSelected: (String) -> Unit
) :
    RecyclerView.Adapter<superheroViewHolder>() {

    fun updateList(list: List<SuperheroItemResponse>) {
        superheroList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): superheroViewHolder {

        return superheroViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_superhero, parent, false)
        )

    }

    override fun getItemCount() = superheroList.size


    override fun onBindViewHolder(viewholder: superheroViewHolder, position: Int) {
        viewholder.bind(superheroList[position], onItemSelected)
    }

}



