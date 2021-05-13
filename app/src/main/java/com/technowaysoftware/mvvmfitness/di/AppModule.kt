package com.technowaysoftware.mvvmfitness.di

import android.content.Context
import androidx.room.Room
import com.technowaysoftware.mvvmfitness.database.RunningDatabase
import com.technowaysoftware.mvvmfitness.utils.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, RunningDatabase::class.java, DATABASE_NAME)
            .build()

    @Singleton
    @Provides
    fun provideDao(database: RunningDatabase) =
        database.getRunningDao()
}