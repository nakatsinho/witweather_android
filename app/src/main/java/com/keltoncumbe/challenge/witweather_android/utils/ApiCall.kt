package com.keltoncumbe.challenge.witweather_android.utils

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.keltoncumbe.challenge.witweather_android.models.*
import io.reactivex.Single
import kotlinx.parcelize.Parcelize
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiCall {


//FIXME:: I was forced to abandon this implementation beacause i'm getting supercharged response
//@GET("data/2.5/weather?q=Maputo&appid=2f26f4026a31178c80d27a7b501e15a9&units=metric")
//fun fetchData() : Single<Temperature>
//FIXME:: END

@GET("group")
suspend fun getWeatherByCityId(
    @Query("id") cityId: String,
    @Query("appid") clientApiKey: String,
    @Query("units") units: String
): WeatherResponse

    @GET("weather")
    suspend fun getWeatherByCityName(
        @Query("q") cityName: String,
        @Query("appid") clientApiKey: String,
        @Query("units") units: String
    ): WeatherDetailsResponse
}


data class WeatherResponse(
    @SerializedName("list") val list: List<Temperature>
)

@Parcelize
data class WeatherDetailsResponse(
    @SerializedName("coord") val coord: Coord,
    @SerializedName("weather") val weather: List<Weather>,
    @SerializedName("base") val base: String,
    @SerializedName("main") val main: Main,
    @SerializedName("wind") val wind: Wind,
    @SerializedName("clouds") val clouds: Clouds,
    @SerializedName("dt") val dt: Int,
    @SerializedName("sys") val sys: Sys,
    @SerializedName("timezone") val timezone: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("cod") val cod: Int
) : Parcelable {
    val cityAndCountry: String get() = "$name, ${sys.country}"
}