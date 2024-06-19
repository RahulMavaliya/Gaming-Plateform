package com.example.game

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun TournamentBanner(
    imageResources: List<Int>,
    autoScroll: Boolean = true,
    autoScrollDuration: Long = 3000L
) {
    var selectedIndex by remember { mutableIntStateOf(0) }
    Spacer(modifier = Modifier.height(5.dp))

    Box(
        modifier = Modifier
            .width(328.dp)
            .height(166.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .pointerInput(Unit) {
                    detectHorizontalDragGestures { _, dragAmount ->
                        selectedIndex = (selectedIndex + if (dragAmount > 0) -1 else 1)
                            .coerceIn(0, imageResources.size - 1)
                    }
                }
        ) {
            Image(
                painter = painterResource(id = imageResources[selectedIndex]),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        if (autoScroll) {
            LaunchedEffect(selectedIndex) {
                delay(autoScrollDuration)
                selectedIndex = (selectedIndex + 1) % imageResources.size
            }
        }

        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(top = 4.dp)
        ) {
            for (i in imageResources.indices) {
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .size(8.dp)
                        .background(
                            if (i == selectedIndex) Color.White else Color.Gray,
                            shape = CircleShape
                        )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TournamentBannerPreview() {
    TournamentBanner(
        imageResources = listOf(
            R.drawable.banner,
            R.drawable.pubg,
            R.drawable.banner
        )
    )
}
