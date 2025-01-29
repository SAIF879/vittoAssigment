package com.example.vittoassigment.naivgation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation


fun NavGraphBuilder.favouriteNavGraph(navController: NavController) {
    navigation(
        route = NavGraph.FAVOURITES,
        startDestination = FavouritesScreens.FavouritesScreen.route
    ) {
        composable(route = FavouritesScreens.FavouritesScreen.route) {
//            SplashScreen(navController)
        }
    }
}

private sealed class FavouritesScreens(val route: String) {
    data object FavouritesScreen : FavouritesScreens(route = "favourite_screen")
}