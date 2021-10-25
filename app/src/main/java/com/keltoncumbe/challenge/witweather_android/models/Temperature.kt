package com.keltoncumbe.challenge.witweather_android.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Temperature(
    @SerializedName("base") val base: String,
    @SerializedName("clouds")
    val clouds: Clouds,
    @SerializedName("cod")
    val cod: Int,
    @SerializedName("coord")
    val coord: Coord,
    @SerializedName("dt")
    val dt: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("main")
    val main: Main,
    @SerializedName("name")
    val name: String,
    @SerializedName("sys")
    val sys: Sys,
    @SerializedName("timezone")
    val timezone: Int,
    @SerializedName("visibility")
    val visibility: Int,
    @SerializedName("weather")
    val weather: List<Weather>,
    @SerializedName("wind")
    val wind: Wind
) : Parcelable {
    val cityAndCountry: String get() = "$name, ${sys.country}"
}

interface CityListener {
    fun onCityClicked(weatherResult: Temperature)
}