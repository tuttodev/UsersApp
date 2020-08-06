package com.example.kotlinusersapp.vo

import com.example.kotlinusersapp.domain.WebService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    private val webService: WebService
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://reqres.in/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        webService = retrofit.create(WebService::class.java)
    }

    fun getService(): WebService {
        return webService
    }

    companion object{
        private var INSTANCE: RetrofitClient? = null

        fun getInstance(): RetrofitClient? {
            INSTANCE = INSTANCE ?: RetrofitClient()
            return INSTANCE
        }
    }
}