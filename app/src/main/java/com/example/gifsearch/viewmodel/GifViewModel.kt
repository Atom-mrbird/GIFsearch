
package com.example.gifsearch.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gifsearch.data.remote.dto.GifObject
import com.example.gifsearch.data.repository.GifRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class GifViewModel(private val repository: GifRepository) : ViewModel() {
    private val _gifs = MutableStateFlow<List<GifObject>>(emptyList())
    val gifs: List<GifObject> get() = _gifs.value

    fun searchGifs(query: String) {
        viewModelScope.launch {
            try {
                val response = repository.searchGifs(query, offset = 0, limit = 25)
                _gifs.value = response.data
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
