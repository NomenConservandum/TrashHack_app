package com.example.trashhack_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trashhack_app.ui.theme.Trashhack_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            //val navController = rememberNavController()
            androidx.navigation.compose.NavHost(navController = navController, startDestination = "Log_In_Screen") {
                composable("Log_In_Screen") {
                    com.example.trashhack_app.LoginScreen(navController)
                }
                composable("toclean_page") {
                    com.example.trashhack_app.ToCleanPage(navController)
                }
                composable("mainmenu") {
                    com.example.trashhack_app.MainMenu(navController)
                }
            }
            /*
            Trashhack_appTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    com.example.trashhack_app.LoginScreen(navController) //ToCleanPage()
                }
            }
             */
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Trashhack_appTheme {
        Greeting("Android")
    }
}