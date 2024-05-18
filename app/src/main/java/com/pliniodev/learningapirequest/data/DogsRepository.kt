package com.pliniodev.learningapirequest.data

class DogsRepository(
    private val api: DogsGateway,
) {
    suspend fun getRandomDogImage() = api.getRandomDogImage()
}