package com.example.ocean.api

import com.example.ocean.Criatura
import retrofit2.Call
import retrofit2.http.GET

interface CriaturaService {

    @GET("creature")
    fun listar(): Call<List<Criatura>>
}