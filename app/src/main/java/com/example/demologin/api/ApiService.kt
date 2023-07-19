package com.example.demologin.api

import com.example.demologin.model.LoginRequest
import com.example.demologin.model.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("/customers/login")
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>
}