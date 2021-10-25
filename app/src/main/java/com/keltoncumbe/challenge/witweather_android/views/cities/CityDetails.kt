package com.keltoncumbe.challenge.witweather_android.views.cities

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
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
import com.keltoncumbe.challenge.witweather_android.utils.WeatherResponse
import kotlin.math.roundToInt

var temp_max = 0
var temp_min = 0

@Composable
fun CityDetails(navController: NavController) {
    Scaffold {
        BodyHeader()
    }
}

private fun retrieveWeatherDetails(weatherResponse: WeatherResponse) {
    val w = weatherResponse.list[0]
    temp_max = w.main.tempMax.toInt()
    temp_min = w.main.tempMin.roundToInt()
}

@Composable
fun BodyHeader(){
    var imagePath = "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/bg_light.png?token=ANCKLUBIBAFIVDCCUEWKWHDBP2KHK"


    Box(modifier = Modifier.fillMaxSize()){
        Image(painter =  rememberCoilPainter(request = imagePath),
            modifier = Modifier.fillMaxWidth(2f),
            contentScale = ContentScale.Crop,
            contentDescription = ""
        )

        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            item {
                DetailHeader()
            }

            item {
                Row (modifier = Modifier.align(Alignment.Center).fillMaxWidth(),){
                    Text(
                        text = "Max: ",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(
                            top = 20.dp,
                            start = 16.dp,
                            bottom = 16.dp
                        ),
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "${temp_max}",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 26.sp,
                        modifier = Modifier.padding(
                            top = 20.dp,
                            start = 16.dp,
                            bottom = 16.dp
                        ),
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Clouds",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(
                            top = 20.dp,
                            start = 16.dp,
                            bottom = 16.dp
                        ),
                    )
                }
            }
            item {
                Cards()
            }
        }
    }
}

@Composable
@Preview
fun DetailHeader() {

    val homeHeaderBg = "https://raw.githubusercontent.com/nakatsinho/witweather_flutter/main/logo.png?token=ANCKLUFN3ICKV374353FIXDBP2VI4"

    Box (contentAlignment = Alignment.TopCenter, modifier = Modifier.fillMaxWidth().padding(10.dp)){
        Column (){
            Text(
                text = "Detalhes da Cidade",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.White,
                letterSpacing = (-1).sp
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "MAPUTO - MOZ",
                fontWeight = FontWeight.Light,
                fontSize = 18.sp,
                lineHeight = 24.sp,
                letterSpacing = ((-0.2).sp)
            )
        }

        Image(
            painter = rememberCoilPainter(request = homeHeaderBg, fadeIn = true),
            contentDescription = "",
            modifier = Modifier
                .height(300.dp)
                .width(150.dp)
                .align(Alignment.Center)
        )
    }
}

@Composable
fun Cards()
{
    Box(){
        LazyRow(
            horizontalArrangement = Arrangement.SpaceBetween,
            contentPadding = PaddingValues(horizontal = 16.dp),
            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp).width(10.dp)
        ) {
            item {
                VerticalButton(tag = "Wind",vector = Icons.Filled.AirplanemodeActive, text = "8.49 \nKM/H")
            }
            item {
                VerticalButton(tag = "Sunrise",vector = Icons.Filled.WbSunny, text = "Cars") }
            item {
                VerticalButton(tag = "Sunset",vector = Icons.Filled.Mood, text = "Hotel")
            }
            item {
                VerticalButton(tag = "Pressu",vector = Icons.Filled.Compress, text = "Cruise")
            }
        }
    }
}
@Composable
fun VerticalButton(tag:String ,vector: ImageVector, text: String) {
        Button(
            onClick = {  },
            shape = RoundedCornerShape(8.dp),
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = tag)
                Icon(
                    modifier = Modifier.padding(vertical = 16.dp, horizontal = 8.dp),
                    imageVector = vector, contentDescription = ""
                )
                Text(text = text)
            }
        }
}

