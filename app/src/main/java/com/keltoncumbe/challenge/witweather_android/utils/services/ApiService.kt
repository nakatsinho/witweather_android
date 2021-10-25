package com.keltoncumbe.challenge.witweather_android.utils.services

import com.keltoncumbe.challenge.witweather_android.models.Temperature
import com.keltoncumbe.challenge.witweather_android.utils.ApiCall
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class ApiService @Inject constructor(private val apiService: ApiCall) {
    suspend fun getWeatherByCityName(cityName: String, clientApiKey: String, units: String) =
        apiService.getWeatherByCityName(cityName, clientApiKey, units)

    suspend fun getWeatherByCityId(cityId: String, clientApiKey: String, units: String) =
        apiService.getWeatherByCityId(cityId, clientApiKey, units)

    //FIXME:: This too belongs to the abandoned implemenation
//    private val URL_PATH = "https://api.openweathermap.org/"
//    private val API = Retrofit.Builder().baseUrl(URL_PATH).addConverterFactory(GsonConverterFactory.create()).build().create(ApiCall::class.java)
//
//    fun  fetchDataService (): Single<Temperature>{
//        return API.fetchData()
//    }
    //FIXME:: END
}