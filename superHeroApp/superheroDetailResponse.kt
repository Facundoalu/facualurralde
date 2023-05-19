package com.alumaster.androidalu.superHeroApp

import com.google.gson.annotations.SerializedName

class superheroDetailResponse(@SerializedName("name") val name: String,
        @SerializedName ("powerstats") val powerstats:powerStatsResponse,
        @SerializedName ("image") val image:SuperheroImageDetail)

data class powerStatsResponse(
    @SerializedName("intelligence") val intelligence: String,
    @SerializedName("strenght") val strenght: String,
    @SerializedName("durability") val durability: String,
    @SerializedName("power") val power: String,
    @SerializedName("speed") val speed: String,
    @SerializedName("combat") val combat: String,

)

data class SuperheroImageDetail(@SerializedName ("url") val url :String)

