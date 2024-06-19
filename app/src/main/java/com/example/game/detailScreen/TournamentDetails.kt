package com.example.game.detailScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.game.R

@Preview
@Composable
fun TournamentDetailsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        TopSection()
        TournamentInfoSection()
        TabSection()
        TournamentDetails()
    }
}

@Composable
fun TopSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(185.dp)
            .background(Color(0xFF001208))
    ) {
        Image(
            painter = painterResource(id = R.drawable.battle_img), // replace with your image resource
            contentDescription = "Tournament Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(8.dp)
                .width(211.dp)
                .height(24.dp)
                .background(color = Color(0xCCFFFFFF), shape = RoundedCornerShape(size = 16.dp))

                .padding(start = 8.dp, top = 4.dp, end = 8.dp, bottom = 4.dp)
        ) {
            Text(
                text = "Registration Closes in 2d 15h 10m",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                   // fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF001208),

                    )
            )
        }

        Column(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(8.dp),
            horizontalAlignment = Alignment.End
        ) {
            Row(modifier = Modifier
                .width(74.dp)
                .height(24.dp)
                .background(color = Color(0xCCFFFFFF), shape = RoundedCornerShape(size = 16.dp))
                .padding(start = 8.dp, top = 6.dp, end = 8.dp, bottom = 6.dp),
                verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        modifier = Modifier
                            .padding(1.dp)
                            .width(12.dp)
                            .height(12.dp),
                        painter = painterResource(id = R.drawable.ic_group),
                        contentDescription = "image description",
                        contentScale = ContentScale.None
                    )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    modifier = Modifier
                        .width(42.dp)
                        .height(12.dp),
                    text = "670/800",
                    style = TextStyle(
                        fontSize = 10.sp,
//fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF001208),
                    )
                )
            }
        }
    }
}

@Composable
fun TournamentInfoSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row {
            Text(
                modifier = Modifier
                    .width(214.dp)
                    .height(30.dp),
                text = "PUBG tournament  ",
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 30.sp,
                    //fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFFFFFF),
                )
            )
            Spacer(modifier = Modifier.width(65.dp))
            Image(
                modifier = Modifier
                    .padding(1.dp)
                    .size(40.dp),
                painter = painterResource(id = R.drawable.maki_gaming),
                contentDescription = "image description",
                contentScale = ContentScale.FillBounds,
            )
        }
        Spacer(modifier = Modifier.height(2.dp))

        Row(
            modifier = Modifier
                .width(85.dp)
                .height(17.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp , Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                modifier = Modifier
                    .width(66.dp)
                    .height(17.dp),
                text = "Entry - 10",
                style = TextStyle(
                    fontSize = 14.sp,
                  //  fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                )
            )
            Image(
                modifier = Modifier
                    .padding(1.dp)
                    .width(12.dp)
                    .height(12.dp),
                painter = painterResource(id = R.drawable.twemoji_coin),
                contentDescription = "image description",
                contentScale = ContentScale.FillBounds
            )
        }

    }
}

@Composable
fun TabSection() {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    val tabs = listOf("Overview", "Players", "Rules", "Standings")

    TabRow(selectedTabIndex = selectedTabIndex, backgroundColor = Color.Black, contentColor = Color.White) {
        tabs.forEachIndexed { index, title ->
            Tab(
                selected = selectedTabIndex == index,
                onClick = { selectedTabIndex = index },
                text = {
                    Text(text = title, color = Color.White,
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 21.sp,
                            //fontFamily = FontFamily(Font(R.font.roboto)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),

                            textAlign = TextAlign.Center,
                            letterSpacing = 0.25.sp,
                        ))
                }
            )
        }
    }
}

@Composable
fun TournamentDetails() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFF1A1A1A), shape = RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        DetailItem(label = "TEAM SIZE", value = "Solo")
        Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
        DetailItem(label = "FORMAT", value = "Single Elimination")
        Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
        DetailItem(label = "TOURNAMENT STARTS", value = "Tue 24th Jan 2024, 01:00 PM")
        Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
        DetailItem(label = "CHECK-IN", value = "10 mins before the match starts")
    }
}

@Composable
fun DetailItem(label: String, value: String) {
    Column {
        Text(
            text = label,
            color = Color.Gray,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = value,
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

//fun TournamentDetails() {
//
//
//    // Top Portion
//    Box(
//        modifier = Modifier
//            .border(width = 1.dp, color = Color(0xFF363636))
//            .width(360.dp)
//            .height(250.dp)
//            .background(color = Color(0xFF001208))
//    ) {
//
//        Image(
//            painter = painterResource(id = R.drawable.battle_img),
//            contentDescription = "image description",
//            contentScale = ContentScale.Crop
//        )
//
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(185.dp)
//        ) {
//            Row(
//                modifier = Modifier
//                    .align(Alignment.BottomStart)
//                    .padding(start = 8.dp, bottom = 8.dp)
//                    .background(color = Color(0xCCFFFFFF), shape = RoundedCornerShape(size = 16.dp))
//                    .padding(horizontal = 8.dp, vertical = 4.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Text(
//                    text = "Registration Closes in 2d 15h 10m",
//                    style = TextStyle(
//                        fontSize = 12.sp,
//                        fontWeight = FontWeight(500),
//                        color = Color(0xFF001208),
//                    )
//                )
//            }
//
//            Row(
//                modifier = Modifier
//                    .align(Alignment.BottomEnd)
//                    .padding(end = 8.dp, bottom = 8.dp)
//                    .background(color = Color(0xCCFFFFFF), shape = RoundedCornerShape(size = 16.dp))
//                    .padding(horizontal = 8.dp, vertical = 4.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.spacedBy(4.dp)
//            ) {
//                Image(
//                    modifier = Modifier
//                        .size(12.dp),
//                    painter = painterResource(id = R.drawable.ic_group),
//                    contentDescription = "image description",
//                    contentScale = ContentScale.None
//                )
//                Text(
//                    text = "670/800",
//                    style = TextStyle(
//                        fontSize = 10.sp,
//                        fontWeight = FontWeight(500),
//                        color = Color(0xFF001208),
//                    )
//                )
//            }
//        }
//    }
//
//
//    Spacer(modifier = Modifier.height(16.dp))
//
//// Tournament details
//    Column(
//        modifier = Modifier
//            .padding(horizontal = 16.dp)
//    ) {
//        Text(
//            text = "PUBG Tournament",
//            style = TextStyle(
//                fontSize = 20.sp,
//                fontWeight = FontWeight(500),
//                color = Color(0xFFFFFFFF),
//            )
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//
//    }
//}



//fun TournamentDetails() {
//
//    Box(
//        modifier = Modifier
//            .border(width = 1.dp, color = Color(0xFF363636))
//            .width(360.dp)
//            .height(218.dp)
//            .background(color = Color(0xFF001208))
//    ) {
//
//        Image(
//            modifier = Modifier
//                .width(360.dp)
//                .height(185.dp),
//            painter = painterResource(id = R.drawable.compete_in_battles),
//            contentDescription = "image description",
//            contentScale = ContentScale.Crop
//        )
//
//        Row(
//            modifier = Modifier
//                .width(211.dp)
//                .height(24.dp)
//                .background(color = Color(0xCCFFFFFF), shape = RoundedCornerShape(size = 16.dp))
//        ) {
//            Text(
//                modifier = Modifier
//                    .width(195.dp)
//                    .height(16.dp),
//                text = "Registration Closes in 2d 15h 10m",
//                style = TextStyle(
//                    fontSize = 12.sp,
//                    lineHeight = 16.sp,
//                    //fontFamily = FontFamily(Font(R.font.inter)),
//                    fontWeight = FontWeight(500),
//                    color = Color(0xFF001208),
//                )
//            )
//        }
//
//        Row(
//            modifier = Modifier
//                .width(74.dp)
//                .height(24.dp)
//                .background(color = Color(0xCCFFFFFF), shape = RoundedCornerShape(size = 16.dp))
//                .padding(start = 8.dp, top = 6.dp, end = 8.dp, bottom = 6.dp),
//            horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.Start),
//            verticalAlignment = Alignment.CenterVertically,
//        ) {
//            Row(
//                modifier = Modifier
//                    .width(58.dp)
//                    .height(12.dp),
//                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
//                verticalAlignment = Alignment.CenterVertically,
//            ) {
//                Image(
//                    modifier = Modifier
//                        .padding(1.dp)
//                        .width(12.dp)
//                        .height(12.dp),
//                    painter = painterResource(id = R.drawable.ic_group),
//                    contentDescription = "image description",
//                    contentScale = ContentScale.None
//                )
//
//                Text(
//                    modifier = Modifier
//                        .width(42.dp)
//                        .height(12.dp),
//                    text = "670/800",
//                    style = TextStyle(
//                        fontSize = 10.sp,
//                       // fontFamily = FontFamily(Font(R.font.inter)),
//                        fontWeight = FontWeight(500),
//                        color = Color(0xFF001208),
//                    )
//                )
//            }
//        }
//
//    }
//}