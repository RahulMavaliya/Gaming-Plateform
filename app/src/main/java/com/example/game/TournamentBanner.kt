package com.example.game

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
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
    val coroutineScope = rememberCoroutineScope()
    Spacer(modifier = Modifier.height(5.dp))

    Box(
        modifier = Modifier
            .width(328.dp)
            .height(166.dp)
    ) {
        val images = imageResources.size
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .pointerInput(Unit) {
                    detectHorizontalDragGestures { _, dragAmount ->
                        selectedIndex = (selectedIndex + if (dragAmount > 0) -1 else 1)
                            .coerceIn(0, images - 1)
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
                selectedIndex = (selectedIndex + 1) % images
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


//@Preview
//@Composable
//fun TournamentBanner(){
//    Column(
//        modifier = Modifier
//            .width(328.dp)
//            .height(166.dp),
//        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        Image(
//            modifier = Modifier
//                .width(328.dp)
//                .height(150.dp),
//            painter = painterResource(id = R.drawable.banner),
//            contentDescription = "image description",
//            contentScale = ContentScale.FillBounds
//        )
//
//        Row(
//            modifier = Modifier
//                .width(72.dp)
//                .height(8.dp)
//                .padding(start = 16.dp, end = 16.dp),
//            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
//            verticalAlignment = Alignment.CenterVertically,
//        ) {
//            Image(
//                modifier = Modifier
//                    .padding(1.dp)
//                    .width(8.dp)
//                    .height(8.dp)
//                    .background(color = Color(0xFFFFFFFF)),
//                painter = painterResource(id = R.drawable.ellipse1),
//                contentDescription = "image description",
//                contentScale = ContentScale.None
//            )
//            Image(
//                modifier = Modifier
//                    .padding(1.dp)
//                    .width(8.dp)
//                    .height(8.dp)
//                    .background(color = Color(0xFF6F6F6F)),
//                painter = painterResource(id = R.drawable.ellipse2),
//                contentDescription = "image description",
//                contentScale = ContentScale.None
//            )
//
//            Image(
//                modifier = Modifier
//                    .padding(1.dp)
//                    .width(8.dp)
//                    .height(8.dp)
//                    .background(color = Color(0xFF6F6F6F)),
//                painter = painterResource(id = R.drawable.ellipse3),
//                contentDescription = "image description",
//                contentScale = ContentScale.None
//            )
//        }
//    }
//}
