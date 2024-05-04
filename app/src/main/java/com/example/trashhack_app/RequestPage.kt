package com.example.trashhack_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun RequestsPage(navController: NavController) {
    println("Request Page is now active")
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .padding(21.dp)
    ) {
        Text(text = "Hello there! Here You can make a request for some trash to be taken care of!")
        Button(onClick = {
            navController.navigate("mainmenu")
        }) {
            Text(text = "Go back")
        }
        var inputText by remember {
            mutableStateOf("")
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(0.dp)
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(value = inputText, onValueChange = {
                inputText = it
            })
            Button(onClick = {}) {
                Text(text = "Add")
            }
        }
    }
}
