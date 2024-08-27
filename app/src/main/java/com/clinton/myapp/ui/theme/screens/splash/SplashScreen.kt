package com.clinton.myapp.ui.theme.screens.splash

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.clinton.myapp.R
import com.clinton.myapp.navigation.ROUTE_HOME
import kotlinx.coroutines.delay
import androidx.compose.ui.unit.dp

@Composable
fun SplashScreen(navController: NavHostController) {

    LaunchedEffect(Unit){
        delay(2000)
        navController.navigate(ROUTE_HOME)
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ){
        Image(painter = painterResource(id = R.drawable.iphone),
             contentDescription = "Splash Login",
        modifier = Modifier.size(200.dp)
        )
    }

}