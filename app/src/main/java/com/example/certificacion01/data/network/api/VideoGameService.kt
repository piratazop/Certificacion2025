package com.example.certificacion01.data.network.api

import com.example.certificacion01.data.response.VideoGameResponse
import retrofit2.http.GET

interface VideoGameService {
    @GET("games")
    suspend fun getAllVideoGames(): MutableList<VideoGameResponse>


}