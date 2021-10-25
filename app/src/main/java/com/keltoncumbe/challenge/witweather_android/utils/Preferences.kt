package com.keltoncumbe.challenge.witweather_android.utils

import com.keltoncumbe.challenge.witweather_android.utils.services.ApiService
import javax.inject.Inject

class Preferences @Inject constructor(private val apiHelper: ApiService) {

    suspend fun getWeatherByCityName(cityName: String, clientApiKey: String, units: String) =
        apiHelper.getWeatherByCityName(cityName, clientApiKey, units)

    suspend fun getWeatherByCityId(cityId: String, clientApiKey: String, units: String) =
        apiHelper.getWeatherByCityId(cityId, clientApiKey, units)
}