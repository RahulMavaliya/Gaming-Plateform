package com.example.game

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun PeopleToFollowSection() {

    Spacer(modifier = Modifier.height(35.dp))

    Column(
        modifier = Modifier
            .width(327.dp)
            .height(203.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Top),
        horizontalAlignment = Alignment.End,
    ) {
        HeaderRow()

        Column(
            modifier = Modifier
                .width(327.dp)
                .height(168.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {
            FollowRow(
                profileImageId = R.drawable.profile_image,
                userName = "Legend Gamer",
                buttonText = "Follow"
            )
            FollowRow(
                profileImageId = R.drawable.profile_image2,
                userName = "Legend Gamer",
                buttonText = "Follow"
            )
            FollowRow(
                profileImageId = R.drawable.profile_image3,
                userName = "Legend Gamer",
                buttonText = "Follow"
            )
        }
    }
}

@Composable
fun HeaderRow() {
    Row(
        modifier = Modifier
            .width(327.dp)
            .height(19.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom,
    ) {
        Text(
            modifier = Modifier
                .width(124.dp)
                .height(19.dp),
            text = "People to follow",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFF9ECEC),
            )
        )

        Text(
            modifier = Modifier
                .width(72.dp)
                .height(17.dp),
            text = "View More",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF0CF285),
            )
        )
    }
}

@Composable
fun FollowRow(profileImageId: Int, userName: String, buttonText: String) {
    Row(
        modifier = Modifier
            .width(327.dp)
            .height(48.dp)
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
            modifier = Modifier
                .width(142.dp)
                .height(32.dp),
            horizontalArrangement = Arrangement.spacedBy(11.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier
                    .size(32.dp)
                    .background(color = Color.White, shape = CircleShape)
                    .clip(CircleShape),
                painter = painterResource(id = profileImageId),
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )

            Text(
                text = userName,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                )
            )
        }

        FollowButton(buttonText = buttonText)
    }
}

@Composable
fun FollowButton(buttonText: String) {
    Row(
        modifier = Modifier
            .width(69.dp)
            .height(32.dp)
            .background(
                color = Color(0x3301B752),
                shape = RoundedCornerShape(size = 8.dp)
            )
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = buttonText,
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White,
            )
        )
    }
}
