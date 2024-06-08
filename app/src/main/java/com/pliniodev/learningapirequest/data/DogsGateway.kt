package com.pliniodev.learningapirequest.data

import com.pliniodev.learningapirequest.data.response.DogsResponse
import retrofit2.http.GET

interface DogsGateway {

    @GET("breeds/image/random")
    suspend fun getRandomDog(): DogsResponse
}