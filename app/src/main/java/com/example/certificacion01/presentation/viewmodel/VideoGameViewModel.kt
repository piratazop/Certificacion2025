package com.example.certificacion01.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.certificacion01.data.response.VideoGameResponse
import com.example.certificacion01.domain.VideoGameUseCase
import kotlinx.coroutines.launch

class VideoGameViewModel(private val useCase: VideoGameUseCase): ViewModel() {

private var videoGameList = MutableLiveData<MutableList<VideoGameResponse>>()

    val videoGameLV

        get() = videoGameList

    init {
        viewModelScope.launch {
            videoGameList.value = useCase.getAllVideoGamesStock()
        }


    }

}