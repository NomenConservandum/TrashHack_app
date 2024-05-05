package com.example.trashhack_app

import android.app.Application
import com.example.trashhack_app.data.MainDatabase


class App : Application() {
    val LoginDatabase by lazy { MainDatabase.createDataBase(this,"LoginDatabase") }
}