package com.example.kotlinusersapp.domain.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    val ID: String = "",
    @SerializedName("first_name")
    val name: String = "",
    @SerializedName("avatar")
    val urlImage: String = ""
)

data class UserResponse(
    @SerializedName("data")
    val userList: List<User>
)