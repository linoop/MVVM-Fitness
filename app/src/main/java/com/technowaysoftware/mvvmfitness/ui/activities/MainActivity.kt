package com.technowaysoftware.mvvmfitness.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.technowaysoftware.mvvmfitness.R
import com.technowaysoftware.mvvmfitness.database.RunningDao
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var runningDao: RunningDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"Run dao ${runningDao.hashCode()}")
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}