package com.example.game

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

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
        Icon(
            modifier = Modifier
                .size(24.dp)
                .clickable { selectedIndex = 0 },
            painter = painterResource(id = R.drawable.ic_home),
            contentDescription = "Home",
            tint = if (selectedIndex == 0) Color.White else Color.Gray
        )

        Icon(
            modifier = Modifier
                .size(24.dp)
                .clickable { selectedIndex = 1 },
            painter = painterResource(id = R.drawable.solar_cup),
            contentDescription = "Cup",
            tint = if (selectedIndex == 1) Color.White else Color.Gray
        )

        Icon(
            modifier = Modifier
                .size(36.dp)
                .clickable { selectedIndex = 2 },
            painter = painterResource(id = R.drawable.charity_group),
            contentDescription = "Groups",
            tint = if (selectedIndex == 2) Color.White else Color.Gray
        )

        Icon(
            modifier = Modifier
                .size(24.dp)
                .clickable { selectedIndex = 3 },
            painter = painterResource(id = R.drawable.stream),
            contentDescription = "Stream",
            tint = if (selectedIndex == 3) Color.White else Color.Gray
        )
    }
}