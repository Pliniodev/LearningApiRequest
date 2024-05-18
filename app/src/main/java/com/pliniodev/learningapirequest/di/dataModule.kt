package com.pliniodev.learningapirequest.di

import com.pliniodev.learningapirequest.data.DogsRepository
import org.koin.dsl.module

val dataModule = module {
    // we need to provide the DogsRepository with the DogsGateway instance,
    // to do this we use the get() function.
    // The get() function is a Koin function that allows you to get an instance of a class
    // that is already in the Koin container.
    single { DogsRepository(api = get()) }
}