package com.example.trashhack_app.data


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RequestEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    var polutionLevel:String
)
