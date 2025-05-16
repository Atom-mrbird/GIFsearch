
package com.example.gifsearch.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.gifsearch.data.remote.dto.GifObject
import com.example.gifsearch.viewmodel.GifViewModel

@Composable
fun GifSearchScreen(viewModel: GifViewModel) {
    val gifs = viewModel.gifs
    var query by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        OutlinedTextField(
            value = query,
            onValueChange = {
                query = it
                viewModel.searchGifs(query)
            },
            label = { Text("Search GIFs") },
            modifier = Modifier.fillMaxWidth()
        )

        LazyColumn {
            items(gifs) { gif -> GifItem(gif) }
        }
    }
}

@Composable
fun GifItem(gif: GifObject) {
    val context = LocalContext.current
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(text = gif.title, style = MaterialTheme.typography.titleMedium)
        AsyncImage(
            model = ImageRequest.Builder(context)
                .data(gif.images.fixed_height.url)
                .crossfade(true)
                .build(),
            contentDescription = gif.title,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
    }
}
