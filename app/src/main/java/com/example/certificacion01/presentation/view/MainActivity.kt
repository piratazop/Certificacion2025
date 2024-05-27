package com.example.certificacion01.presentation.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.certificacion01.R
import com.example.certificacion01.data.network.api.VideoGameService
import com.example.certificacion01.data.network.retrofit.RetrofitHelper
import com.example.certificacion01.data.repository.VideoGameImplemt
import com.example.certificacion01.databinding.ActivityMainBinding
import com.example.certificacion01.domain.VideoGameUseCase
import com.example.certificacion01.presentation.viewmodel.VideoGameViewModel
import com.example.certificacion01.presentation.viewmodel.ViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val apiService =RetrofitHelper.getRetrofit().create(VideoGameService::class.java)
        val repository =VideoGameImplemt (apiService)
        val useCase = VideoGameUseCase(repository)

        /*El View Model no permite instanciar de esta forma para pasarle el useCase*/
        /*Esta es la forma de instanciar el ViewModel*/
        val viewModelFactory = ViewModelFactory (useCase)

        val viewModel = ViewModelProvider(this,viewModelFactory).get(VideoGameViewModel::class.java)

        viewModel.videoGameLV.observe(this){

            Log.i("GAMES",it.toString())

        }


        }
    }
