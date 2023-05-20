package com.example.runningapppl

import android.content.Context
import androidx.room.Room
import com.example.runningapppl.database.RunDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RunModule {


    @Provides
    @Singleton
    fun provideRunDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context, RunDatabase::class.java, "run_db"
    )
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideRunDao(runDatabase: RunDatabase) = runDatabase.runDao()

}