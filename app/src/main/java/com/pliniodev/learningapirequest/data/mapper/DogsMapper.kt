package com.pliniodev.learningapirequest.data.mapper

import com.pliniodev.learningapirequest.data.response.DogsResponse
import com.pliniodev.learningapirequest.domain.model.Dog

object DogsMapper {
    fun toDomain(response: DogsResponse) = Dog(message = response.message)
}