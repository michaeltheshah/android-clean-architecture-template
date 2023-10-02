package com.mshaw.vin.data.repositories

import com.mshaw.vin.data.models.request.Pokemon
import com.mshaw.vin.data.services.PokemonService
import com.mshaw.vin.util.extensions.toState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PokemonRepository(private val service: PokemonService) {
    suspend fun getPokemon(pokemon: Pokemon) = withContext(Dispatchers.IO) {
        service.getPokemon(pokemon).toState()
    }
}