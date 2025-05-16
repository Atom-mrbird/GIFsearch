
package com.example.gifsearch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.gifsearch.ui.GifSearchScreen
import com.example.gifsearch.viewmodel.GifViewModel
import com.example.gifsearch.data.repository.GifRepository
import com.example.gifsearch.network.RetrofitInstance

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository = GifRepository(RetrofitInstance.api)
        val viewModel = GifViewModel(repository)
        setContent {
            GifSearchScreen(viewModel)
        }
    }
}
