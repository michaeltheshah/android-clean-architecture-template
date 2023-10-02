package com.mshaw.vin.data.services

import com.mshaw.vin.data.models.request.Pokemon
import com.mshaw.vin.data.models.response.PokemonResponse
import com.mshaw.vin.util.extensions.awaitResult
import com.mshaw.vin.util.state.NetworkResult
import io.ktor.client.HttpClient
import io.ktor.http.HttpMethod
import javax.inject.Inject

class PokemonService @Inject constructor(private val client: HttpClient) {
    suspend fun getPokemon(pokemon: Pokemon): NetworkResult<PokemonResponse> {
        return client.awaitResult("pokemon/$pokemon", HttpMethod.Get)
    }
}