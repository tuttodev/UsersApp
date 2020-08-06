package com.example.kotlinusersapp.domain

import com.example.kotlinusersapp.domain.model.UserResponse
import retrofit2.http.GET

interface WebService {
    @GET("users")
    suspend fun getUsers(): UserResponse
}