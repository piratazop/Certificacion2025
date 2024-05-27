package com.example.certificacion01.domain

import com.example.certificacion01.data.repository.VideoGameImplemt
import com.example.certificacion01.data.response.VideoGameResponse

class VideoGameUseCase (private val repository: VideoGameImplemt) {
suspend fun getAllVideoGamesStock():MutableList<VideoGameResponse>{
    return repository.fetchVideoGames()
}




}