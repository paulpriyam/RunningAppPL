package com.example.runningapppl.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.Converters
import com.example.runningapppl.model.Run


@Database(entities = [Run::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class RunDatabase : RoomDatabase() {
    abstract fun runDao(): RunDao
}