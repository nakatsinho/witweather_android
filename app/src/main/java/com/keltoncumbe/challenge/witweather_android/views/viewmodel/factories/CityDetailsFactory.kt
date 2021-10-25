package com.keltoncumbe.challenge.witweather_android.views.viewmodel.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.keltoncumbe.challenge.witweather_android.utils.Preferences
import com.keltoncumbe.challenge.witweather_android.views.viewmodel.CityDetailsVM

@Suppress("EMPTY_CAST")
class CityDetailsFactory (private val rolePreferences: Preferences) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CityDetailsVM::class.java)) {
            return CityDetailsVM(rolePreferences) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }

}