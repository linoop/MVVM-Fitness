package com.technowaysoftware.mvvmfitness.repositories

import com.technowaysoftware.mvvmfitness.database.RunningDao
import com.technowaysoftware.mvvmfitness.database.RunningModel
import javax.inject.Inject

class MainRepository @Inject constructor(val runningDao: RunningDao) {

    suspend fun insertRun(runningModel: RunningModel) = runningDao.insertRun(runningModel)

    suspend fun deleteRun(runningModel: RunningModel) = runningDao.deleteRun(runningModel)

    //LiveData data always execute asynchronously so we don't need to execute these fun inside coroutine
    fun getAllRunsSortedByDate() = runningDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByCaloriesBurned() = runningDao.getAllRunsSortedByCaloriesBurned()

    fun getAllRunsSortedByAvgSpeedInKMH() = runningDao.getAllRunsSortedByAvgSpeedInKMH()

    fun getAllRunsSortedByDistanceInMeter() = runningDao.getAllRunsSortedByDistanceInMeter()

    fun getAllRunsSortedByTimeInMillis() = runningDao.getAllRunsSortedByTimeInMillis()

    fun getTotalAvgSpeedInKMH() = runningDao.getTotalAvgSpeedInKMH()

    fun getTotalCaloriesBurned() = runningDao.getTotalCaloriesBurned()

    fun getTotalDistanceInMeter() = runningDao.getTotalDistanceInMeter()

    fun getTotalTimeInMillis() = runningDao.getTotalTimeInMillis()

}