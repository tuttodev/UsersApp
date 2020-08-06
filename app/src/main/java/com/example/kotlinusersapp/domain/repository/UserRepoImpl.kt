package com.example.kotlinusersapp.domain.repository

import com.example.kotlinusersapp.data.UserDataSource
import com.example.kotlinusersapp.domain.model.User
import javax.inject.Inject

class UserRepoImpl @Inject constructor (private val userDataSource: UserDataSource): UserRepo{
    override suspend fun getUsers(): List<User> {
        return userDataSource.getUsers()
    }

}