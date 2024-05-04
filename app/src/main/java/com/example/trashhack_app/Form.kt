package com.example.trashhack_app

import java.time.Instant
import java.util.Date

data class Form (
    var id: Int,
    var createdAt: Date,
    var user: String,
    var city: String,
    var street: String,
    var house: String,
    var level: Int,
    var status: Boolean
)

fun getFakeForm() : List<Form> {
    return listOf<Form> (
        Form(1, Date.from(Instant.now()), "Shi", "Tya", "Mya", "4a", 1, false),
        Form(2, Date.from(Instant.now()), "Shi", "Mya", "Tya", "4b", 10, false)
    );
}