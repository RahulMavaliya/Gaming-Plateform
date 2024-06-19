package com.example.game

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun TopBar() {
    TopAppBar(
        modifier = Modifier
            .width(360.dp)
            .height(48.dp),
        backgroundColor = Color.Black,
        elevation = 0.dp
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Profile Icon
            IconButton(onClick = { /* Handle Profile icon click */ }) {
                Image(
                    modifier = Modifier
                        .padding(1.dp)
                        .size(40.dp),
                    painter = painterResource(id = R.drawable.ic_profile),
                    contentDescription = "Profile",
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            // Coin Icon and Points
            Row(
                modifier = Modifier
                    .border(width = 1.dp, color = Color(0xFFB6B6B6), shape = RoundedCornerShape(50))
                    .background(color = Color(0x1AFFFFFF), shape = RoundedCornerShape(50))
                    .padding(horizontal = 8.dp, vertical = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(7.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier.size(20.dp),
                    painter = painterResource(id = R.drawable.twemoji_coin),
                    contentDescription = "Coins",
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "2456",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )
                )
            }

            Spacer(modifier = Modifier.width(10.dp))

            // Notification Icon
            IconButton(onClick = { /* Handle notification click */ }) {
                Image(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(id = R.drawable.ic_notification),
                    contentDescription = "Notifications",
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}
