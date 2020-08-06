package com.example.kotlinusersapp.di

import androidx.lifecycle.ViewModelProvider
import com.example.kotlinusersapp.domain.repository.UserRepo
import com.example.kotlinusersapp.presentation.MainViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ViewModelModule {

    @Provides
    fun provideMainViewModelFactory(userRepo: UserRepo): ViewModelProvider.Factory{
        return MainViewModelFactory(userRepo)
    }
}