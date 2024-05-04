package com.example.trashhack_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.util.Locale
import androidx.navigation.NavController

@Composable
fun RequestsListPage(navController: NavController, RequestsList: List<Request>) {
    println("Request List Page is now active")

    println()
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .padding(21.dp)
    ) {
        Text(text = "Привет! Это те места, которые следует очистить!")
        Button(onClick = {
            navController.navigate("mainmenu")
        }) {
            Text(text = "Назад")
        }
        LazyColumn (
            content = {
                itemsIndexed(RequestsList) { index: Int, item: Request ->
                    RequestItem(item = item)
                }
            }
        )
    }
}

@Composable
fun RequestItem(item: Request) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Column (
            modifier = Modifier.weight(1f)
        ){

            Text(
                text = SimpleDateFormat("HH:mm:aa, dd/mm", Locale.ENGLISH).format(item.createdAt),
                fontSize = 10.sp,
                color = Color.Blue
            )
            Text(
                text = item.city.toString(),
                fontSize = 21.sp,
                color = Color.DarkGray
            )
            Text(text = item.street.toString(),
                fontSize = 21.sp,
                color = Color.DarkGray
            )
            Text(text = item.house.toString(),
                fontSize = 21.sp,
                color = Color.DarkGray
            )
            Text(text = item.user.toString(),
                fontSize = 21.sp,
                color = Color.DarkGray
            )
        }
    }
}

