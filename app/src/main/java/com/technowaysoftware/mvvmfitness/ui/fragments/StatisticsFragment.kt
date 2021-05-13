package com.technowaysoftware.mvvmfitness.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.technowaysoftware.mvvmfitness.R
import com.technowaysoftware.mvvmfitness.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.statistics_fragment) {

    private val viewModel: StatisticsViewModel by viewModels()
}