package com.example.dragger_hilt

import android.view.Display
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getData():List<Model>

}