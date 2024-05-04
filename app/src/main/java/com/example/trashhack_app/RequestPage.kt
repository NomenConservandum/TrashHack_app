package com.example.trashhack_app

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import java.time.Instant
import java.util.Date

@Composable
fun RequestsPage(navController: NavController, requestsList: List<Request>) {

    println("Request Page is now active")
    var polution_level : String
    polution_level = ""
    var city by remember {
        mutableStateOf("")
    }
    var street by remember {
        mutableStateOf("")
    }
    var num by remember {
        mutableStateOf("")
    }
    var req: Request
    Column (
        //делаем так чтобы данная колонка занимала весь экран
        modifier = Modifier.fillMaxSize(),
        //ставим вертикальное расположение по центру
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Привет! Здесь вы можете оставить заявку на вывоз мусора!")
        Button(onClick = {
            navController.navigate("mainmenu")
        }) {
            Text(text = "Назад")
        }
        //выставили нужный размер шрифта и вывели текст
        Text(
            text = "Создание запроса",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(4.dp))


        //выбор уровня загрязнения
        polution_level = dropMenu()

        //ввод адреса
        OutlinedTextField(value = city, onValueChange = {
            city = it
        }, label = {
            Text(text = "Город")
        })
        OutlinedTextField(value = street, onValueChange = {
            street = it
        }, label = {
            Text(text = "Улица")
        })
        OutlinedTextField(value = num, onValueChange = {
            num = it
        }, label = {
            Text(text = "Номер Дома")
        })

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            Log.i("Credential", "Pollution level: $polution_level address: $street")
            if (polution_level != "" || street != "") {
                navController.navigate("mainmenu")
                com.example.trashhack_app.req_List.requestsList += listOf<Request> (
                    Request(1, Date.from(Instant.now()), "We", city, street, num, polution_level, false)
                )
            }
        }) {
            Text(text = "Завершить")
        }

    }
}
