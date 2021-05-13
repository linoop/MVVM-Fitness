package com.technowaysoftware.mvvmfitness.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [RunningModel::class], version = 1)
@TypeConverters(Converters::class)
abstract class RunningDatabase : RoomDatabase() {
    abstract fun getRunningDao(): RunningDao
}