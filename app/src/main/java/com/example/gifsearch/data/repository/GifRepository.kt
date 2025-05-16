
package com.example.gifsearch.data.repository

import com.example.gifsearch.network.GiphyService
import com.example.gifsearch.data.remote.dto.GiphyResponse

class GifRepository(private val api: GiphyService) {
    suspend fun searchGifs(query: String, offset: Int, limit: Int): GiphyResponse {
        return api.searchGifs(query, offset, "dW1ksl8Y2V8FdxZ1RZRytFNI1pG3Qatk", limit)
    }
}
