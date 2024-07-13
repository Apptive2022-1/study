package com.apptive.retrofit.template.navigation

sealed class Screen(
    val route: String
) {
    data object Splash: Screen(route = "screen-splash")
    data object Login: Screen(route = "screen-login")
    data object Home: Screen(route = "screen-home")
}