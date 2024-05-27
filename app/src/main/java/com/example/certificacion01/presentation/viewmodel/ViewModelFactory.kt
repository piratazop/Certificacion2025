package com.example.certificacion01.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.certificacion01.domain.VideoGameUseCase

class ViewModelFactory (private val videoGameUseCase:VideoGameUseCase): ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(VideoGameViewModel::class.java)) {
            return VideoGameViewModel(videoGameUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}






