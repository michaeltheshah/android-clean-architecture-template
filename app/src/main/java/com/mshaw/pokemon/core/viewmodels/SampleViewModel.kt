package com.mshaw.vin.core.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshaw.vin.data.models.request.toPokemon
import com.mshaw.vin.data.models.response.PokemonResponse
import com.mshaw.vin.data.repositories.PokemonRepository
import com.mshaw.vin.util.state.State
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SampleViewModel @Inject constructor(private val repository: PokemonRepository) : ViewModel() {
    var searchInput by mutableStateOf("")

    private val _pokemonState: MutableStateFlow<State<PokemonResponse>> = MutableStateFlow(State.Loading)
    val pokemonState = _pokemonState.asStateFlow()

    fun getPokemon() {
        viewModelScope.launch {
            _pokemonState.value = repository.getPokemon(searchInput.toPokemon())
        }
    }
}