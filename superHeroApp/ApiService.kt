package com.alumaster.androidalu.superHeroApp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/10230847298585035/search/{name}")
    suspend fun getSuperheroes(@Path("name") superHeroName:String) :Response<SuperHeroDataResponse>

    @GET("/api/10230847298585035/{id}")
    suspend fun getSuperheroDetail(@Path("id)")superheroId:String):Response<superheroDetailResponse>
}
