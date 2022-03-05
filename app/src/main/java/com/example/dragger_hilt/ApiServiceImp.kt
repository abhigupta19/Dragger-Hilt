package com.example.dragger_hilt

import javax.inject.Inject

class ApiServiceImp @Inject constructor(val apiService: ApiService) {

    suspend fun getData()= apiService.getData();
}