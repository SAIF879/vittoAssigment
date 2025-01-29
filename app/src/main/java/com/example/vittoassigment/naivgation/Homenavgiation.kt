package com.example.vittoassigment.naivgation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation


fun NavGraphBuilder.homeNavGraph(navController: NavController) {
    navigation(
        route = NavGraph.HOME,
        startDestination = HomeScreens.HomeScreen.route
    ) {
        composable(route = HomeScreens.HomeScreen.route) {
        }
        composable(route = HomeScreens.DetailsScreen.route) {
        }
    }
}

private sealed class HomeScreens(val route: String) {
    data object HomeScreen : HomeScreens(route = "home_screen")
    data object DetailsScreen : HomeScreens(route = "details_screen")
}