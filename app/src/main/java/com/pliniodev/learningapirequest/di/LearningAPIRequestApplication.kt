package com.pliniodev.learningapirequest.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

/**
 * Application class responsible for initializing Koin
 * this class is called in the AndroidManifest.xml file
 * and when the application is started, the Koin is initialized
 */
class LearningAPIRequestApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeKoin()
    }

    private fun initializeKoin() {
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@LearningAPIRequestApplication)

            modules(
                networkModule,
                dataModule
            )
        }
    }
}