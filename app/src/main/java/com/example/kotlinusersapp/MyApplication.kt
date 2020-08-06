package com.example.kotlinusersapp

import android.app.Application
import com.example.kotlinusersapp.di.DaggerApplicationComponent
import com.example.kotlinusersapp.di.RetrofitModule
import com.example.kotlinusersapp.di.ViewModelModule

class MyApplication : Application() {
    val appComponent = DaggerApplicationComponent.builder()
        .viewModelModule(ViewModelModule())
        .retrofitModule(RetrofitModule())
        .build()
}