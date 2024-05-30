package com.pliniodev.learningapirequest.di

import com.pliniodev.learningapirequest.ui.home.HomeViewModel
import org.koin.dsl.module

val viewModelModule = module {
    single { HomeViewModel(repository = get()) }
}