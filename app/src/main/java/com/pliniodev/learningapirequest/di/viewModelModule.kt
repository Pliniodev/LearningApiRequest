package com.pliniodev.learningapirequest.di

import com.pliniodev.learningapirequest.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(repository = get()) }
}