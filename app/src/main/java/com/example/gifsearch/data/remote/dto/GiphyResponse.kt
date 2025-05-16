
package com.example.gifsearch.data.remote.dto

data class GiphyResponse(
    val data: List<GifObject>
)

data class GifObject(
    val id: String,
    val title: String,
    val images: GifImages
)

data class GifImages(
    val fixed_height: GifImage
)

data class GifImage(
    val url: String
)
