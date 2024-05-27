package com.example.certificacion01.data.repository

import com.example.certificacion01.data.response.VideoGameResponse

interface VideoGameRepository {



    suspend fun fetchVideoGames():MutableList<VideoGameResponse>

}