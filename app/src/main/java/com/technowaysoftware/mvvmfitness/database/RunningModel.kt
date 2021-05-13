package com.technowaysoftware.mvvmfitness.database

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
class RunningModel(
    var image: Bitmap? = null,
    var timeStamp: Long? = 0L,
    var avgSpeedInKMH: Float = 0f,
    var distanceInMeter: Int = 0,
    var timeInMillis: Long = 0L,
    var caloriesBurned: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}