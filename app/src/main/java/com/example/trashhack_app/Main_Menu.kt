package com.example.trashhack_app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MainMenu(navController: NavController) {

    println("The user is now in main menu")

    Column (
        //делаем так чтобы данная колонка занимала весь экран
        modifier = Modifier.fillMaxSize(),
        //ставим вертикальное расположение по центру
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Меню:", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            navController.navigate("trashrequests")
        }) {
            Text(text = "Список запросов")
        }
        Button(onClick = {
            navController.navigate("request_trashtakeout")
        }) {
            Text(text = "Создать запрос")
        }

    }
}