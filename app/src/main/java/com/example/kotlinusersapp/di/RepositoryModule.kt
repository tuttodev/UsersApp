package com.example.kotlinusersapp.di

import com.example.kotlinusersapp.data.UserDataSource
import com.example.kotlinusersapp.domain.repository.UserRepo
import com.example.kotlinusersapp.domain.repository.UserRepoImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideUserRepo(userDataSource: UserDataSource): UserRepo {
        return UserRepoImpl(userDataSource)
    }
}