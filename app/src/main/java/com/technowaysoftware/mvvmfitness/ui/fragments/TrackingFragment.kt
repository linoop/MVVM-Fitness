package com.technowaysoftware.mvvmfitness.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.technowaysoftware.mvvmfitness.R
import com.technowaysoftware.mvvmfitness.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.tracking_fragment) {

    private val viewModel:MainViewModel by viewModels()
}