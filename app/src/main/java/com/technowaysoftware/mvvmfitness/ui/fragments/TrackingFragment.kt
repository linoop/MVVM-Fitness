package com.technowaysoftware.mvvmfitness.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.gms.maps.GoogleMap
import com.technowaysoftware.mvvmfitness.R
import com.technowaysoftware.mvvmfitness.services.TrackingService
import com.technowaysoftware.mvvmfitness.ui.viewmodels.MainViewModel
import com.technowaysoftware.mvvmfitness.utils.Constants.ACTION_START_OR_RESUME_SERVICE
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.tracking_fragment.*

//@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.tracking_fragment) {

    private val viewModel: MainViewModel by viewModels()
    private var googleMap: GoogleMap? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mapView?.onCreate(savedInstanceState)

        mapView.getMapAsync {
            googleMap = it
        }

        btnToggleRun.setOnClickListener {
            sendCommandToService(ACTION_START_OR_RESUME_SERVICE)
        }
    }

    private fun sendCommandToService(action: String) {
        Intent(requireContext(), TrackingService::class.java).also {
            it.action = action
            requireContext().startService(it)
        }
    }

    override fun onStart() {
        super.onStart()
        mapView?.onStart()
    }

    override fun onResume() {
        super.onResume()
        mapView?.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView?.onPause()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView?.onLowMemory()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView?.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapView?.onSaveInstanceState(outState)
    }
}