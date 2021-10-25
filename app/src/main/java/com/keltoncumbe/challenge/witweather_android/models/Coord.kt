package com.keltoncumbe.challenge.witweather_android.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Coord(
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("lon")
    val lon: Double
):Parcelable