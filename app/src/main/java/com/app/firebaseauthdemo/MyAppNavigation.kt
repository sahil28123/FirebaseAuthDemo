package com.app.firebaseauthdemo

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.app.firebaseauthdemo.Pages.HomePage
import com.app.firebaseauthdemo.Pages.SignInPage
import com.app.firebaseauthdemo.Pages.SignUpPage

@Composable
fun MyAppNavigation(authViewModel: AuthViewModel){
    val NavController = rememberNavController()

    NavHost(navController = NavController, startDestination = "signin", builder = {
        composable("signin"){
            SignInPage(NavController,authViewModel)
        }
        composable("signup"){
            SignUpPage(NavController,authViewModel)
        }
        composable("home"){
            HomePage(NavController,authViewModel)
        }

    } )

}