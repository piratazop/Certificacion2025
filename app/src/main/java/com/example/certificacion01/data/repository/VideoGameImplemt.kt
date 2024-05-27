package com.example.certificacion01.data.repository

import com.example.certificacion01.data.network.api.VideoGameService
import com.example.certificacion01.data.response.VideoGameResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class VideoGameImplemt(private var apiservice: VideoGameService) : VideoGameRepository {

    override suspend fun fetchVideoGames(): MutableList<VideoGameResponse> {
        return withContext(Dispatchers.IO) {
            val listVideoGames = apiservice.getAllVideoGames()
            listVideoGames
        }
    }
}



