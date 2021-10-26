# Witweather_android

This is a challenge assigned by Wit, which aimed to build an Android App to visualize the temperature in my current location, in this case (Maputo - MOZ) and in some suggested European cities (Lisbon, Madrid, Paris, Berlin, Copenhagen , Rome, London, Dublin, Prague and Vienna).

For the sake of distraction, I will have initially created the App in Flutter (Dart Language) and then migrated to Native Android (with Kotlin), as soon as I realized the request.

I was assigned the link (http://openweathermap.org/api), so that I could consume the data brought by the same API -> OPEN WEATHER MAP.

Below I present the built interface: 
<div style="display: inline_block">
<img  alt="Kcumbe-Splash" src="https://github.com/nakatsinho/witweather_android/blob/master/preview/screenshot-1635140284213.png" width="280px">
<img  alt="Kcumbe-AllCities" src="https://github.com/nakatsinho/witweather_android/blob/master/preview/screenshot-1635140570735.png" width="280px">
<img  alt="Kcumbe-Details" src="https://github.com/nakatsinho/witweather_android/blob/master/preview/screenshot-1635141720926.png" width="280px">
 </div>

## Getting Started

This project is a starting point for a Android/Kotlin application.

I present now, the packages I used during the construction of my code 

A few resources to get you started if this is your first Flutter project:

- [Bumptech Glide](https://github.com/bumptech/glide) - A modern way to get images from source using imagesLibrary
- [Jetpack Compose - Accompanist Coil](https://coil-kt.github.io/coil/compose/) - To Get Images from URL
- [Android Parcelable](https://developer.android.com/reference/android/os/Parcelable) - Used to send messages between components 
- [Android Retrofit](https://square.github.io/retrofit/) - Used to make HTTP client requests
- [Hilt](https://dagger.dev/hilt/) - Hilt provides a standard way to incorporate Dagger dependency injection into an Android application.
- [Android Navigation Compose](https://developer.android.com/jetpack/compose/navigation) - To manage routes navigation using NavController.
- [Android Lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle#kts) - These components help you produce better-organized, and often lighter-weight code, that is easier to maintain.

## Unsolved Bugs

During my developement process i stack on the following bugs:
- Show data on Composable Components
- Finish the Details City View
- Retrive data from Api response method
- Resolve route maps in "onClick action button"

## Features
- Date / Time conversion
- Show Data on View Components
