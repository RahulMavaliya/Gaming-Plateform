package com.example.game

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun NavBar() {
    var selectedIndex by remember { mutableIntStateOf(0) }

    Row(
        modifier = Modifier
            .shadow(elevation = 4.dp, spotColor = Color(0xFF7F7F7F), ambientColor = Color(0xFF7F7F7F))
            .fillMaxWidth()
            .height(64.dp)
            .background(color = Color(0xFF08090A))
            .padding(horizontal = 16.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        NavBarItem(
            iconId = R.drawable.ic_home,
            contentDescription = "Home",
            isSelected = selectedIndex == 0,
            onClick = { selectedIndex = 0 }
        )

        NavBarItem(
            iconId = R.drawable.solar_cup,
            contentDescription = "Cup",
            isSelected = selectedIndex == 1,
            onClick = { selectedIndex = 1 }
        )

        NavBarItem(
            iconId = R.drawable.charity_group,
            contentDescription = "Groups",
            isSelected = selectedIndex == 2,
            iconSize = 36.dp,
            onClick = { selectedIndex = 2 }
        )

        NavBarItem(
            iconId = R.drawable.stream,
            contentDescription = "Stream",
            isSelected = selectedIndex == 3,
            onClick = { selectedIndex = 3 }
        )
    }
}

@Composable
fun NavBarItem(
    iconId: Int,
    contentDescription: String,
    isSelected: Boolean,
    iconSize: Dp = 24.dp,
    onClick: () -> Unit
) {
    Icon(
        modifier = Modifier
            .size(iconSize)
            .clickable { onClick() },
        painter = painterResource(id = iconId),
        contentDescription = contentDescription,
        tint = if (isSelected) Color.White else Color.Gray
    )
}
