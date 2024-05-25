package com.pliniodev.learningapirequest.domain

import com.pliniodev.learningapirequest.domain.model.Dog

interface DogsRepository {
    suspend fun getRandomDog(): Dog
}