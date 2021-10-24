package com.keltoncumbe.challenge.witweather_android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.keltoncumbe.challenge.witweather_android.views.AllCitiesList

@Composable
fun Routes(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Maps.AllCitiesList.route)
    {
        composable(route = Maps.AllCitiesList.route)
        {
            AllCitiesList(navController)
        }
    }
}