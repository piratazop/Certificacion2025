package com.example.certificacion01.data.network.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

fun getRetrofit(): Retrofit {
    return Retrofit.Builder()
       .baseUrl("https://my-json-server.typicode.com/himuravidal/gamesDB/")
       .addConverterFactory(GsonConverterFactory.create())
    .build()

}
}