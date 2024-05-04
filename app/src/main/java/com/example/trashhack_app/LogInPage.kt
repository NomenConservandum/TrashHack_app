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

@Composable
fun LoginScreen() {
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
        Text(text = "Welcome!", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Login to your account")

        Spacer(modifier = Modifier.height(16.dp))

        //ввод почты(пока просто label)
        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Email address")
        })


        Spacer(modifier = Modifier.height(16.dp))

        //ввод пароля(пока просто label)
        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            Log.i("Credential", "Email: $email Password: $password")
        }) {
            Text(text = "Login")
        }
        TextButton(onClick = { }) {
            Text(text = "Forgot your Password?")
        }

        /*
        Text(text = "Forgot yout Password?", Modifier.clickable {

        })
         */

        Spacer(modifier = Modifier.height(48.dp))

        Text(text = "Skip", Modifier.clickable {

        })
    }
}