package com.example.trashhack_app

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun CreateAccountPage(navController: NavController) {
    println("The user is now on CreateAccount screen")
    var nameUser by remember {
        mutableStateOf("")
    }
    var familyUser by remember {
        mutableStateOf("")
    }
    var companyUser by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column (
        //делаем так чтобы данная колонка занимала весь экран
        modifier = Modifier.fillMaxSize(),
        //ставим вертикальное расположение по центру
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        //выставили нужный размер шрифта и вывели текст
        Button(onClick = {
            navController.navigate("Log_In_Screen")
        }) {
            Text(text = "Назад")
        }

        Text(text = "Создание аккаунта", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(16.dp))


        //ввод фамилии
        OutlinedTextField(value = familyUser, onValueChange = {
            familyUser = it
        }, label = {
            Text(text = "Фамилия")
        })

        Spacer(modifier = Modifier.height(16.dp))


        //ввод имени
        OutlinedTextField(value = nameUser, onValueChange = {
            nameUser = it
        }, label = {
            Text(text = "Имя")
        })
        Spacer(modifier = Modifier.height(16.dp))

        //ввод компании
        OutlinedTextField(value = companyUser, onValueChange = {
            companyUser = it
        }, label = {
            Text(text = "Компания/организация")
        })

        //ввод почты
        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Почта")
        })


        Spacer(modifier = Modifier.height(16.dp))

        //ввод пароля
        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Пароль")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {}){
            Text(text = "Создать аккаунт")
        }
    }
}