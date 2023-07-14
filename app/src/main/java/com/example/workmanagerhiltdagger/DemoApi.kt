package com.example.workmanagerhiltdagger

import retrofit2.Response
import retrofit2.http.GET

interface DemoApi {
    @GET("post/1")
    suspend fun getPost(): Response<Post>
}