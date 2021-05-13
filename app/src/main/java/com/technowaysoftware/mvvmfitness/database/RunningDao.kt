package com.technowaysoftware.mvvmfitness.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunningDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(runningModel: RunningModel)

    @Delete
    suspend fun deleteRun(runningModel: RunningModel)

    @Query("SELECT * FROM running_table ORDER BY timeStamp DESC")
    fun getAllRunsSortedByDate(): LiveData<List<RunningModel>>

    @Query("SELECT * FROM running_table ORDER BY timeInMillis DESC")
    fun getAllRunsSortedByTimeInMillis(): LiveData<List<RunningModel>>

    @Query("SELECT * FROM running_table ORDER BY caloriesBurned DESC")
    fun getAllRunsSortedByCaloriesBurned(): LiveData<List<RunningModel>>

    @Query("SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC")
    fun getAllRunsSortedByAvgSpeedInKMH(): LiveData<List<RunningModel>>

    @Query("SELECT * FROM running_table ORDER BY distanceInMeter DESC")
    fun getAllRunsSortedByDistanceInMeter(): LiveData<List<RunningModel>>

    @Query("SELECT SUM(timeInMillis) FROM running_table")
    fun getTotalTimeInMillis(): LiveData<Long>

    @Query("SELECT SUM(caloriesBurned) FROM running_table")
    fun getTotalCaloriesBurned(): LiveData<Long>

    @Query("SELECT SUM(distanceInMeter) FROM running_table")
    fun getTotalDistanceInMeter(): LiveData<Long>

    @Query("SELECT AVG(avgSpeedInKMH) FROM running_table")
    fun getTotalAvgSpeedInKMH(): LiveData<Long>
}