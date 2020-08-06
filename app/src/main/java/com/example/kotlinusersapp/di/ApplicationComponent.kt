package com.example.kotlinusersapp.di

import com.example.kotlinusersapp.presentation.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ViewModelModule::class,
        RetrofitModule::class,
        RepositoryModule::class,
        DataSourceModule::class
    ]
)
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}