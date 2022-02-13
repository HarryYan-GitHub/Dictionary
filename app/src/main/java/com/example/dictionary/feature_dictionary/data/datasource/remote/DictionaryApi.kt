package com.example.dictionary.feature_dictionary.data.datasource.remote

import com.example.dictionary.feature_dictionary.data.datasource.remote.dto.WordInfoDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("api/v2/entries/en/{word}")
    suspend fun getWordInfo(
        @Path("word") word: String
    ): List<WordInfoDto>
}