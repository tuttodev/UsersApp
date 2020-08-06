package com.example.kotlinusersapp.data

import com.example.kotlinusersapp.domain.model.User

interface UserDataSource {
    suspend fun getUsers(): List<User>
}