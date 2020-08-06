package com.example.kotlinusersapp.domain.repository

import com.example.kotlinusersapp.domain.model.User

interface UserRepo {
    suspend fun getUsers(): List<User>
}