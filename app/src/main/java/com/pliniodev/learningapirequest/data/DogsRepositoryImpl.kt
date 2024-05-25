package com.pliniodev.learningapirequest.data

import com.pliniodev.learningapirequest.data.mapper.DogsMapper
import com.pliniodev.learningapirequest.domain.DogsRepository
import com.pliniodev.learningapirequest.domain.model.Dog

class DogsRepositoryImpl(
    private val api: DogsGateway,
) : DogsRepository {
    override suspend fun getRandomDog(): Dog {
        val response = api.getRandomDog()
        return DogsMapper.toDomain(response)
    }
}