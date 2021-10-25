package com.keltoncumbe.challenge.witweather_android.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Clouds(
    @SerializedName("all")
    val all: Int
) : Parcelable