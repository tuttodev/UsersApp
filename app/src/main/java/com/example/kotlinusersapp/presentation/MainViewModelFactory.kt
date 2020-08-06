package com.example.kotlinusersapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinusersapp.domain.repository.UserRepo
import javax.inject.Inject

class MainViewModelFactory @Inject constructor (private val userRepo: UserRepo): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(UserRepo::class.java).newInstance(userRepo)
    }
}