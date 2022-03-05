package com.example.dragger_hilt

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
class AppModule {

    @Provides
    fun getBaseUrl():String="https://jsonplaceholder.typicode.com/";

    @Provides
    @Singleton
    fun getRetrofit(baseUrl:String):Retrofit
        = Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build()


    @Provides
    @Singleton
    fun getRetro(retrofit: Retrofit):ApiService=
         retrofit.create(ApiService::class.java)


}
