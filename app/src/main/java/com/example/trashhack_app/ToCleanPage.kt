package com.example.trashhack_app

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ToCleanPage(modifier: Modifier = Modifier) {
    println("ToCleanPage is now active")
    Text(text = "Hello there! These are the items to be thrown away!")
}