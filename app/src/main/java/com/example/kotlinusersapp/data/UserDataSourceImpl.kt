package com.example.kotlinusersapp.data

import com.example.kotlinusersapp.domain.WebService
import com.example.kotlinusersapp.domain.model.User
import javax.inject.Inject

class UserDataSourceImpl @Inject constructor (private val webService: WebService): UserDataSource {
    override suspend fun getUsers(): List<User> {
        return webService.getUsers().userList
    }
}