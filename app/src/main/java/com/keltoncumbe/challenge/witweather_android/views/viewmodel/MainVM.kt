package com.keltoncumbe.challenge.witweather_android.views.viewmodel

import androidx.lifecycle.ViewModel
import com.keltoncumbe.challenge.witweather_android.utils.*
import kotlinx.coroutines.Dispatchers
import androidx.lifecycle.liveData
import com.keltoncumbe.challenge.witweather_android.utils.enviroment.*

class MainVM (private val rolePreferences: Preferences): ViewModel(){
    //FIXME:: One More abandoned Implementation
//    private val weatherAPIService = ApiService()
//    private val disposable = CompositeDisposable()
//
//    val weather_data = MutableLiveData<Temperature>()
//    val weather_error = MutableLiveData<Boolean>()
//    val weather_load = MutableLiveData<Boolean>()
//
//    fun refreshData (){
//        getDataFromApi()
//    }
//
//    private fun getDataFromApi(){
//        weather_load.value = true
//        disposable.add(
//            weatherAPIService.fetchDataService()
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeWith(object :DisposableSingleObserver<Temperature>(){
//                    override fun  onSuccess(t:Temperature){
//                        weather_data.value = t
//                        weather_error.value =false
//                        weather_load.value = false
//                    }
//
//                    override fun  onError(e:Throwable){
//                        weather_load.value = false
//                        weather_error.value =true
//                    }
//                })
//        )
//    }

    // FIXME:: END BLOCK

    fun getMyCityWeather() = liveData(Dispatchers.IO) {
        emit(Resource.loading(null))
        try {
            emit(
                Resource.success(
                    rolePreferences.getWeatherByCityName(
                        MY_CITY_NAME,
                        API_KEY,
                        UNITS_METRIC
                    )
                )
            )
        } catch (e: Exception) {
            emit(Resource.error(null, e.message))
        }
    }

    fun getEuropeanCitiesWeather() = liveData(Dispatchers.IO) {
        emit(Resource.loading(null))
        try {
            emit(
                Resource.success(
                    rolePreferences.getWeatherByCityId(
                        EUROPEAN_CITIES,
                        API_KEY,
                        UNITS_METRIC
                    )
                )
            )
        } catch (e: Exception) {
            emit(Resource.error(null, e.message))
        }
    }
}