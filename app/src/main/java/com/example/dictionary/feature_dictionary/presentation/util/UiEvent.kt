package com.example.dictionary.feature_dictionary.presentation.util

sealed class UiEvent {
    data class ShowSnackBar(val message: String): UiEvent()
}
