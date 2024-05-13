package com.pliniodev.learningapirequest.di

import com.pliniodev.learningapirequest.network.BuildRetrofit
import org.koin.dsl.module

val networkModule = module {
    single { BuildRetrofit.build() }
}