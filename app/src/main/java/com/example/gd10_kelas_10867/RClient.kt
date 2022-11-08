package com.example.gd10_kelas_10867

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RClient {
    private const val BASE_URL = "http://192.168.162.85:8080/ci4-apiserver/public/"
    val instances:api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(api::class.java)
    }
}