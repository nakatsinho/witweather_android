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
import com.google.accompanist.coil.rememberCoilPainter
import com.keltoncumbe.challenge.witweather_android.ui.witBlue

@Composable
fun AllCitiesList (navController: NavController){
    Scaffold{
        Body()
    }
}

@Composable
fun CenterBG(){
    Column {
        Text(text = "Hello Cagadas")
    }
}


@Composable
fun Body(){
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
//                    navController.navigate("home")
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