package com.example.demologin.model

data class LoginResponse(
    val accessToken: String,
    val customer: Customer,
)
