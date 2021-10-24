package com.keltoncumbe.challenge.witweather_android.navigation

sealed class Maps( val  route: String){
    object  AllCitiesList : Maps("all_cities_list")
//    object  DetailScreen : Maps("city_details")
}
