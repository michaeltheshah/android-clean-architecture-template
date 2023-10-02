package com.mshaw.vin.data.di.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.addDefaultResponseValidation
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.Logging
import io.ktor.http.URLProtocol
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {
    private val interceptor = Interceptor { chain ->
        val request = chain.request()
        val newUrl = request
            .url
            .newBuilder()
            .addQueryParameter("format", "json")
            .build()
        chain.proceed(
            request.newBuilder().url(newUrl).build()
        )
    }

    @OptIn(ExperimentalSerializationApi::class)
    val json = Json {
        ignoreUnknownKeys = true
        allowStructuredMapKeys = true
        encodeDefaults = false
        explicitNulls = false
        isLenient = true
    }

    @Provides
    @Singleton
    fun provideHttpClient(): HttpClient =
        HttpClient(OkHttp) {
            expectSuccess = true

            engine {
                addInterceptor(HttpLoggingInterceptor())
                addNetworkInterceptor(interceptor)
            }

            defaultRequest {
                url {
                    protocol = URLProtocol.HTTPS
                    host = "pokeapi.co/api/v2"
                }
            }

            addDefaultResponseValidation()
            install(Logging)
            install(ContentNegotiation) {
                json(json)
            }
        }
}