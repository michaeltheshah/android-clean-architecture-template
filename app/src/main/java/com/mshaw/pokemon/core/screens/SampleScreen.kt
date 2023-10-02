package com.mshaw.vin.core.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mshaw.vin.core.theme.PokemonTheme
import com.mshaw.vin.core.viewmodels.SampleViewModel
import com.mshaw.vin.util.state.State

@Composable
fun SampleScreen() {
    val viewModel = hiltViewModel<SampleViewModel>()
    Column {
        Text(text = "Hello, world!")
    }
}

@Preview(showBackground = true)
@Composable
fun SampleScreenPreview() {
    PokemonTheme {
        SampleScreen()
    }
}