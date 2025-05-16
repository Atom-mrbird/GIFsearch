
package com.example.gifsearch.network

import com.example.gifsearch.data.remote.dto.GiphyResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GiphyService {
    @GET("v1/gifs/search")
    suspend fun searchGifs(
        @Query("q") query: String,
        @Query("offset") offset: Int,
        @Query("api_key") apiKey: String,
        @Query("limit") limit: Int = 25
    ): GiphyResponse
}
