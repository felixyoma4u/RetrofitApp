package com.emoyoma.retrofitapp.api

import com.emoyoma.retrofitapp.models.User
import retrofit2.Call
import retrofit2.http.GET

interface PlaceholderAPI {
    @GET("users")
    fun getUsers(): Call<List<User>>
}