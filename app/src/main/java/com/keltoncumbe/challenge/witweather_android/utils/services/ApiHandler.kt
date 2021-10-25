package com.keltoncumbe.challenge.witweather_android.utils.services

import com.keltoncumbe.challenge.witweather_android.utils.enviroment.URL_PATH
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

object ApiHandler {
    private val retrofit: Retrofit
        get() {
            return Retrofit.Builder()
                .baseUrl(URL_PATH)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

    @Provides
    @Singleton
    fun apiService(): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}