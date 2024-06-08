package com.pliniodev.learningapirequest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import com.pliniodev.learningapirequest.ui.home.HomeViewModel
import com.pliniodev.learningapirequest.ui.theme.LearningApiRequestTheme
import org.koin.androidx.compose.koinViewModel
import com.pliniodev.learningapirequest.ui.component.DogCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = koinViewModel<HomeViewModel>()
            val state = viewModel.homeState.collectAsState()

            LaunchedEffect(key1 = Unit) {
                viewModel.getDogImage()
            }

            LearningApiRequestTheme {
                HomeContent(
                    imageUrl = state.value.dogImageUrl
                )
            }
        }
    }

    @Composable
    private fun HomeContent(
        imageUrl: String,
    ) {
        Column {
            DogCard(url = imageUrl)
        }
    }
}