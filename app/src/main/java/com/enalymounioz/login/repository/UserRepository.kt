package com.enalymounioz.login.repository

import com.enalymounioz.login.data.api.request.LoginRequest
import com.enalymounioz.login.data.api.response.LoginResponse
import com.enalymounioz.login.data.api.methods.UserApi
import retrofit2.Response

class UserRepository {

    suspend fun loginUser(loginRequest: LoginRequest): Response<LoginResponse>? {
        return  UserApi.getApi()?.loginUser(loginRequest = loginRequest)
    }
}