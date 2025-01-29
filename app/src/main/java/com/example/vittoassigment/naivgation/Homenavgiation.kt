package com.example.vittoassigment.naivgation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.vittoassigment.mainflow.splash.ui.SplashScreen


fun NavGraphBuilder.homeNavGraph(navController: NavController) {
    navigation(
        route = NavGraph.SPLASH,
        startDestination = SplashScreens.SplashScreen.route
    ) {
        composable(route = SplashScreens.SplashScreen.route) {
            SplashScreen(navController)
        }
    }
}

sealed class HomeScreens(val route: String) {
    data object HomeScreen : SplashScreens(route = "home_screen")
    data object DetailsScreen : SplashScreens(route = "details_screen")
}