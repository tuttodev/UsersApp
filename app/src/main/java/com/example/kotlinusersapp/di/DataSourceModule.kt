package com.example.kotlinusersapp.di

import com.example.kotlinusersapp.data.UserDataSource
import com.example.kotlinusersapp.data.UserDataSourceImpl
import com.example.kotlinusersapp.domain.WebService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataSourceModule {
    @Singleton
    @Provides
    fun provideUserDataSource(webService: WebService): UserDataSource{
        return UserDataSourceImpl(webService)
    }
}