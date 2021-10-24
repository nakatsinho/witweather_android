package com.keltoncumbe.challenge.witweather_android

import android.graphics.Color
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.keltoncumbe.challenge.witweather_android.navigation.Routes
//import androidx.compose.ui.platform.setContent
import com.keltoncumbe.challenge.witweather_android.ui.WitWeatherTheme
import com.keltoncumbe.challenge.witweather_android.views.AllCitiesList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


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
}