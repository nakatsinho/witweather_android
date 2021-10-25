package com.keltoncumbe.challenge.witweather_android

import android.content.SharedPreferences
import android.graphics.Color
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.keltoncumbe.challenge.witweather_android.navigation.Routes
import com.keltoncumbe.challenge.witweather_android.ui.WitWeatherTheme
import com.keltoncumbe.challenge.witweather_android.views.cities.HomeTripModel
import com.keltoncumbe.challenge.witweather_android.views.viewmodel.MainVM


class MainActivity : AppCompatActivity() {

//    private  lateinit var viewModel: MainVM
//
//    private  lateinit var GET: SharedPreferences
//    private  lateinit var SET: SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        GET = getSharedPreferences(packageName, MODE_PRIVATE)
//        SET = GET.edit()
//
//        viewModel = ViewModelProviders.of(this).get(MainVM::class.java)
//
//        var cName = GET.getString("cityName","Gaza")
//
////        edt_city_name.setText(cName)
//
//        viewModel.refreshData()
//
//        getLiveData()

        val windows = this.window
        windows.statusBarColor = Color.BLUE

        setContent {
            WitWeatherTheme {
                // A surface container using the 'background' color from the theme
                Surface (modifier = Modifier.fillMaxSize(),
                color =  MaterialTheme.colors.background)
                {
                    Routes()
                }
            }
        }
    }

//    private fun getLiveData() {
//        viewModel.weather_data.observe(this, Observer { data -> data?.let {  } })
//    }

}