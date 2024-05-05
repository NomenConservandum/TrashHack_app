package com.example.trashhack_app.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "loginTable")
data class LoginEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val familyUser: String,
    val nameUser: String,
    val companyUser: String,
    val email: String,
    val password: String
)
