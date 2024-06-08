package com.pliniodev.learningapirequest.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun DogCard(url: String) {
    Card(
        modifier = Modifier.padding(12.dp),
        shape = RoundedCornerShape(12.dp),
    ) {
        AsyncImage(
            model = url,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.FillWidth
        )
    }
}

@Preview
@Composable
private fun FullDogImagePreview(){
    DogCard(url = "")
}