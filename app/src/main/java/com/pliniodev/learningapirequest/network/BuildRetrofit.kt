package com.pliniodev.learningapirequest.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit
import retrofit2.Retrofit

private const val CONNECTION_TIMEOUT: Long = 60000L

@OptIn(ExperimentalSerializationApi::class)
object BuildRetrofit {
    private val networkJson = Json { ignoreUnknownKeys = true }
    private val contentType = "application/json".toMediaType()
    private const val BASE_URL = "https://dog.ceo/api/"

    operator fun invoke(): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(provideOkHttpClient())
            .addConverterFactory(networkJson.asConverterFactory(contentType))
            .build()

    private fun provideOkHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder()
            .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS)
            .readTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS)
            .addNetworkInterceptor(interceptor)
            .addInterceptor(interceptor)

        return client.build()
    }
}

