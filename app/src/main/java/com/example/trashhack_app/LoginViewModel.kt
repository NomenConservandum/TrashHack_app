package com.example.trashhack_app

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.trashhack_app.data.MainDatabase

class LoginViewModel(database: MainDatabase) :ViewModel() {

    companion object{
        val Loginfactory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {
                val logindata = (checkNotNull(extras[APPLICATION_KEY]) as App).LoginDatabase
                return LoginViewModel(logindata) as T
            }
        }
    }
}