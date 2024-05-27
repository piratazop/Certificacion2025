package com.example.certificacion01.data.network.api
import com.example.certificacion01.data.network.retrofit.RetrofitHelper
import com.example.certificacion01.data.response.VideoGameResponse
class VideoGameApiClient {



    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getVideoGame(): MutableList<VideoGameResponse> {
        val response = retrofit.create(VideoGameService::class.java).getAllVideoGames()
        return response

    }




}