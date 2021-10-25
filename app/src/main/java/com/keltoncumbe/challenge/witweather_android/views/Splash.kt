package com.keltoncumbe.challenge.witweather_android.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.coil.rememberCoilPainter
import com.keltoncumbe.challenge.witweather_android.navigation.Maps
import com.keltoncumbe.challenge.witweather_android.navigation.Routes
import com.keltoncumbe.challenge.witweather_android.ui.witBlue
import com.keltoncumbe.challenge.witweather_android.views.cities.AllCitiesList

@Composable
fun Splash (navController: NavController){
    Scaffold{
        Body()
    }
}

@Composable
fun Body(){
    val navController = rememberNavController()
    var imagePath = "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/bg_text.png?token=ANCKLUDSYN7XQS6VXM2LNSLBPZDVI"

    Box(modifier = Modifier.fillMaxSize()){
        Image(painter =  rememberCoilPainter(request = imagePath),
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop,
        contentDescription = ""
        )

        Column(modifier = Modifier.align(Alignment.BottomStart).fillMaxWidth().padding(46.dp)){
            Button(
                onClick = {
                    navController.navigate(Maps.DetailScreen.route)
                },
                modifier = Modifier
                    .padding(8.dp, 24.dp)
                    .fillMaxWidth()
            ) {

                Text(text = "Ver Cidades")

                Spacer(modifier = Modifier.width(8.dp))

                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = ""
                )

            }
        }
    }
}