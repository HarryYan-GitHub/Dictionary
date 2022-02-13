package com.example.dictionary.feature_dictionary.presentation.get_word_info

import com.example.dictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
