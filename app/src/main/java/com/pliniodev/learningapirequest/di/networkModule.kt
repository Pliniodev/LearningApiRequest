package com.pliniodev.learningapirequest.di

import com.pliniodev.learningapirequest.data.DogsGateway
import com.pliniodev.learningapirequest.network.BuildRetrofit
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.create

val networkModule = module {
    single { BuildRetrofit.build() }

    // here we are using the Retrofit instance to create the DogsGateway,
    // with this we communicate with the API
    single<DogsGateway> {
        val retrofit = get<Retrofit>()
        retrofit.create<DogsGateway>()
    }
}