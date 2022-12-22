package com.enalymounioz.login.data.api.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("user_id")
    var user_id: Int,
    @SerializedName("username")
    var username: String,
    @SerializedName("email")
    var email: String,
    @SerializedName("userRole")
    var userRole: String,
    @SerializedName("access_token")
    var access_token: String
)