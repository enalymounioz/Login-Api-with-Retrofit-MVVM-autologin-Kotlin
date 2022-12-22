package com.enalymounioz.login.data.api.methods

import com.enalymounioz.login.data.api.request.LoginRequest
import com.enalymounioz.login.data.api.response.LoginResponse
import com.enalymounioz.login.data.api.ApiClient
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {

    @POST("/healthmonitor/users/login")
    suspend fun loginUser(@Body loginRequest: LoginRequest): Response<LoginResponse>

    companion object {
        fun getApi(): UserApi? {
            return ApiClient.client?.create(UserApi::class.java)
        }
    }
}