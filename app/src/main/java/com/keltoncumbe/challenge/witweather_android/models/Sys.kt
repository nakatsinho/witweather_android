package com.keltoncumbe.challenge.witweather_android.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Sys(
    @SerializedName("country")
    val country: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("sunrise")
    val sunrise: Int,
    @SerializedName("sunset")
    val sunset: Int,
    @SerializedName("type")
    val type: Int
) : Parcelable