package com.keltoncumbe.challenge.witweather_android.views.cities

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.coil.rememberCoilPainter
import com.keltoncumbe.challenge.witweather_android.ui.witBlue

@Composable
fun AllCitiesList(navController: NavController) {
   Scaffold {
           Body()
   }
}

@Composable
fun Body(){
    var imagePath = "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/bg_light.png?token=ANCKLUBIBAFIVDCCUEWKWHDBP2KHK"

    Column (modifier = Modifier.background(witBlue)){
        HomeHeader()
        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier.fillMaxSize()){
            Image(painter =  rememberCoilPainter(request = imagePath),
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
                contentDescription = ""
            )
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                //TODO:: I was trying to put a secondary title to header, but i sow that will not be the same UI built in Flutter
                //TODO:: U can follow a link bellow -> https://github.com/nakatsinho/witweather_flutter
//                item {
//                    Text(
//                        text = "Cidades Sugeridas",
//                        color = Color.Black,
//                        fontWeight = FontWeight.Bold,
//                        fontSize = 18.sp,
//                        modifier = Modifier.padding(
//                            top = 20.dp,
//                            start = 16.dp,
//                            bottom = 16.dp
//                        ),
//                    )
//                }
                itemsIndexed(tripListing) { position, data ->
                    HomeTripItem(homeTripModel = data,navController = rememberNavController())
                }
            }
        }
    }
}

@Composable
@Preview
fun HomeHeader() {
    Box{
        Column(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(26.dp)
        ) {
            Text(
                text = "Lista de Cidades",
                fontSize = 28.sp,
                letterSpacing = (-1).sp,
                color = Color.White
            )
        }
    }
}


data class HomeTripModel(
    val image: String,
    val dayPerson: String,
    val title: String,
)

@Composable
fun HomeTripItem(homeTripModel: HomeTripModel,navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {

        Row() {
            Image(
                painter = rememberCoilPainter(request = homeTripModel.image, fadeIn = true),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .clickable {
                        navController.navigate("detail")
                    }
                    .height(80.dp)
                    .width(80.dp)
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(
                    text = homeTripModel.title,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 22.sp,
                    lineHeight = 24.sp
                )

                Text(
                    text = homeTripModel.dayPerson,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.weight(1f))
            Icon(
                imageVector = Icons.Default.ArrowForwardIos,
                contentDescription = "",
                tint = Color(255, 255, 255),
                modifier = Modifier
                    .padding(4.dp)
                    .size(32.dp)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}

val tripListing = listOf<HomeTripModel>(
    HomeTripModel(
        "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/logo.png?token=ANCKLUFN3ICKV374353FIXDBP2VI4",
        "Max: | Min:",
        "MAPUTO - MOZ",
    ),

    HomeTripModel(
        "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/logo.png?token=ANCKLUFN3ICKV374353FIXDBP2VI4",
        "Max: | Min:",
        "LISBOA - PRT",
    ),

    HomeTripModel(
        "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/logo.png?token=ANCKLUFN3ICKV374353FIXDBP2VI4",
        "Max: | Min:",
        "MADRID - ESP",
    ),

    HomeTripModel(
        "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/logo.png?token=ANCKLUFN3ICKV374353FIXDBP2VI4",
        "Max: | Min:",
        "PARIS - FRA",
    ),


    HomeTripModel(
        "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/logo.png?token=ANCKLUFN3ICKV374353FIXDBP2VI4",
        "Max: | Min:",
        "BERLIM - DEU",
    ),

    HomeTripModel(
        "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/logo.png?token=ANCKLUFN3ICKV374353FIXDBP2VI4",
        "Max: | Min:",
        "COPENHAGA - DS",
    ),

    HomeTripModel(
        "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/logo.png?token=ANCKLUFN3ICKV374353FIXDBP2VI4",
        "Max: | Min:",
        "ROMA - ITA",
    ),

    HomeTripModel(
        "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/logo.png?token=ANCKLUFN3ICKV374353FIXDBP2VI4",
        "Max: | Min:",
        "LONDRES - LD",
    ),

    HomeTripModel(
        "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/logo.png?token=ANCKLUFN3ICKV374353FIXDBP2VI4",
        "Max: | Min:",
        "BUBLIN - IRL",
    ),

    HomeTripModel(
        "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/logo.png?token=ANCKLUFN3ICKV374353FIXDBP2VI4",
        "Max: | Min:",
        "PRAGA - CHE",
    ),
    )