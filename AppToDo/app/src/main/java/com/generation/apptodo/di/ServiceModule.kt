package com.generation.apptodo.di

import com.generation.apptodo.api.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
object ServiceModule {

    @Singleton
    @Provides
    fun returnrepository(): Repository{
        return Repository()
    }

}