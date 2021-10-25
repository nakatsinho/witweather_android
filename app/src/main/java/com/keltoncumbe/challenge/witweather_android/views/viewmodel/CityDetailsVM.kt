package com.keltoncumbe.challenge.witweather_android.views.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.keltoncumbe.challenge.witweather_android.utils.Preferences
import com.keltoncumbe.challenge.witweather_android.utils.Resource
import com.keltoncumbe.challenge.witweather_android.utils.enviroment.API_KEY
import com.keltoncumbe.challenge.witweather_android.utils.enviroment.UNITS_METRIC
import kotlinx.coroutines.Dispatchers

class CityDetailsVM (private val rolePreferences: Preferences) : ViewModel() {

        fun getWeatherByCityId(id: String) = liveData(Dispatchers.IO) {
            emit(Resource.loading(null))
            try {
                emit(Resource.success(rolePreferences.getWeatherByCityId(id, API_KEY, UNITS_METRIC)))
            } catch (e: Exception) {
                emit(Resource.error(null, e.message))
            }
        }
    }