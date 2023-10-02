package com.mshaw.vin.data.di.modules

import com.mshaw.vin.data.repositories.PokemonRepository
import com.mshaw.vin.data.services.PokemonService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object PokemonModule {
    @Provides
    @Singleton
    fun providesPokemonService(client: HttpClient) = PokemonService(client)

    @Provides
    @Singleton
    fun providesPokemonRepository(service: PokemonService) = PokemonRepository(service)
}