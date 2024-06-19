package com.example.game.detailScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.game.R

@Composable
fun TournamentDetailsScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        item { TopSection() }
        item { TournamentInfoSection() }
        item { TabSection() }
        item { TournamentDetails() }
        item { TotalTournamentPrize() }
        item { RoundsAndSchedule() }
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
            painter = painterResource(id = R.drawable.battle_img),
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
            Row(
                modifier = Modifier
                    .width(74.dp)
                    .height(24.dp)
                    .background(color = Color(0xCCFFFFFF), shape = RoundedCornerShape(size = 16.dp))
                    .padding(start = 8.dp, top = 6.dp, end = 8.dp, bottom = 6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .padding(1.dp)
                        .width(10.dp)
                        .height(10.dp),
                    painter = painterResource(id = R.drawable.charity_group_solid),
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
                text = "PUBG tournament",
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 30.sp,
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
            horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                modifier = Modifier
                    .width(66.dp)
                    .height(17.dp),
                text = "Entry - 10",
                style = TextStyle(
                    fontSize = 14.sp,
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

    TabRow(
        selectedTabIndex = selectedTabIndex,
        backgroundColor = Color.Black,
        contentColor = Color.White
    ) {
        tabs.forEachIndexed { index, title ->
            Tab(
                selected = selectedTabIndex == index,
                onClick = { selectedTabIndex = index },
                text = {
                    Text(
                        text = title, color = Color.White,
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 10.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        )
                    )
                }
            )
        }
    }
}

@Composable
fun TournamentDetails() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            modifier = Modifier
                .width(63.dp)
                .height(23.dp),
            text = "Details",
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 23.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFFECECEC),
                letterSpacing = 0.36.sp,
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        val details = listOf(
            Triple(R.drawable.fluent_people_team, "TEAM SIZE", "Solo"),
            Triple(R.drawable.tabler_tournament, "FORMAT", "Single Elimination"),
            Triple(R.drawable.fontisto_date, "TOURNAMENT STARTS", "Tue 24th Jan 2024, 01:00 PM"),
            Triple(R.drawable.fluent_mdl2_reminder, "CHECK-IN", "10 mins before the match starts")
        )

        Column(
            modifier = Modifier
                .width(260.dp)
                .height(208.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {
            details.forEach { detail ->
                DetailRow(iconRes = detail.first, title = detail.second, description = detail.third)
            }
        }
    }
}

@Composable
fun DetailRow(iconRes: Int, title: String, description: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(34.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
        verticalAlignment = Alignment.Top,
    ) {
        Image(
            modifier = Modifier
                .padding(1.dp)
                .size(32.dp),
            painter = painterResource(id = iconRes),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier
                .fillMaxHeight(),
            verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 10.sp,
                    lineHeight = 12.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF9D9D9D),
                    letterSpacing = 0.25.sp,
                )
            )
            Text(
                text = description,
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 0.25.sp,
                )
            )
        }
    }
}


@Composable
fun TotalTournamentPrize() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Total Tournament Prize Row with horizontal gradient background
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color(0xFF182920), Color(0xFF4D5A53))
                    ),
                    shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp)
                )
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            Text(
                text = "Total Tournament Prize",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 22.sp,
                    fontWeight = FontWeight.W500,
                    color = Color.White,
                    letterSpacing = 0.32.sp,
                ),
                modifier = Modifier.weight(1f)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "2000",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight.W500,
                        color = Color.White,
                        letterSpacing = 0.25.sp,
                    )
                )

                Box(
                    modifier = Modifier
                        .padding(start = 4.dp)
                        .size(19.dp)
                        .background(color = Color(0xFF00DA4D), shape = RoundedCornerShape(4.dp))
                ) {
                    Text(
                        text = "G",
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 14.sp,
                            fontWeight = FontWeight.W400,
                            color = Color(0xFF001208),
                            letterSpacing = 0.24.sp,
                        ),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }
        }

        // Individual Prize Rows
        PrizeRow(prize = "1st Prize", amount = "1000")
        Spacer(modifier = Modifier.height(1.dp)) // Add small gap after 1st Prize row
        PrizeRow(prize = "2nd Prize", amount = "500")
        Spacer(modifier = Modifier.height(1.dp)) // Add small gap after 2nd Prize row
        PrizeRow(prize = "3rd Prize", amount = "200")
        Spacer(modifier = Modifier.height(1.dp)) // Add small gap after 3rd Prize row
        PrizeRow(prize = "4th Prize", amount = "100")
        Spacer(modifier = Modifier.height(1.dp)) // Add small gap after 4th Prize row
        PrizeRow(prize = "5th Prize", amount = "100")
    }
}

@Composable
fun PrizeRow(prize: String, amount: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 45.dp) // Ensure each row has a minimum height
            .background(color = Color(0xFF182920)) // Background color for prize rows
            .padding(start = 12.dp, top = 8.dp, end = 13.83347.dp, bottom = 13.dp),
        horizontalArrangement = Arrangement.spacedBy(164.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.Bottom,
    ) {
        Text(
            text = prize,
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 20.sp, // Adjusted line height for better readability
                fontWeight = FontWeight.W400,
                color = Color.White,
                letterSpacing = 0.25.sp,
            ),
            modifier = Modifier.weight(1f)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = amount,
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 20.sp, // Adjusted line height for better readability
                    fontWeight = FontWeight.W500,
                    color = Color.White,
                    letterSpacing = 0.25.sp,
                )
            )

            Box(
                modifier = Modifier
                    .padding(start = 4.dp)
                    .size(19.dp)
                    .background(color = Color(0xFF00DA4D), shape = RoundedCornerShape(4.dp))
            ) {
                Text(
                    text = "G",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 14.sp,
                        fontWeight = FontWeight.W400,
                        color = Color(0xFF001208),
                        letterSpacing = 0.24.sp,
                    ),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    }
}

@Preview
@Composable
fun RoundsAndSchedule() {
    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
        // Header outside the border
        Text(
            text = "Rounds and Schedule",
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.inter)),
                fontWeight = FontWeight.Bold,
                color = Color.White
            ),
            modifier = Modifier.padding(bottom = 10.dp)
        )

        // Bordered column for table
        Column(
            modifier = Modifier
                .border(
                    width = 2.dp,
                    color = Color(0xFF1A2A21),
                    shape = RoundedCornerShape(size = 8.dp)
                )
                .width(328.dp)
                .height(233.dp)
                .background(Color.Black)
        ) {
            // Column header row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color(0xFF182920), Color(0xFF4D5A53))
                        )
                    )
                    .padding(horizontal = 8.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Rounds",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),
                    ),
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = "Round type",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),
                    ),
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = "Promotions",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),
                    ),
                    modifier = Modifier.weight(1f)
                )
            }

            val rounds = listOf(
                Triple("Qualifiers", "Single Elimination", "Top 4 from every group"),
                Triple("Quarter Finals", "Single Elimination", "Top 4 from every group"),
                Triple("Semi-Final", "Single Elimination", "Top 4 of all"),
                Triple("Final", "Single Elimination", "Winner")
            )

            rounds.forEach { round ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .background(Color.Black)
                        .padding(horizontal = 8.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = round.first,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFFBCBCBC),
                        ),
                        modifier = Modifier.weight(1f),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )

                    Text(
                        text = round.second,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFFBCBCBC),
                        ),
                        modifier = Modifier.weight(1f),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )

                    Text(
                        text = round.third,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFFBCBCBC),
                        ),
                        modifier = Modifier.weight(1f),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}







//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp)
//    ) {
//        Text(
//            text = "Rounds and Schedule",
//            style = TextStyle(
//                fontSize = 18.sp,
//                lineHeight = 23.sp,
//                fontWeight = FontWeight(600),
//                color = Color.White,
//                letterSpacing = 0.36.sp
//            ),
//            modifier = Modifier.width(196.dp)
//                .height(28.dp)
//        )
//
//        val rounds = listOf(
//            Triple("Qualifiers", "Single Elimination", "Top 4 from every group"),
//            Triple("Quarter Finals", "Single Elimination", "Top 4 from every group"),
//            Triple("Semi-Final", "Single Elimination", "Top 4 of all"),
//            Triple("Final", "Single Elimination", "Winner")
//        )
//
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
//        ) {
//            Row(
//                modifier = Modifier
//                    .background(Color.DarkGray)
//                    .padding(8.dp)
//            ) {
//                Text(
//                    text = "Rounds",
//                    style = TextStyle(
//                        fontSize = 14.sp,
//                        fontWeight = FontWeight.Bold,
//                        color = Color.White
//                    ),
//                    modifier = Modifier.weight(1f)
//                )
//                Text(
//                    text = "Round type",
//                    style = TextStyle(
//                        fontSize = 14.sp,
//                        fontWeight = FontWeight.Bold,
//                        color = Color.White
//                    ),
//                    modifier = Modifier.weight(1f)
//                )
//                Text(
//                    text = "Promotions",
//                    style = TextStyle(
//                        fontSize = 14.sp,
//                        fontWeight = FontWeight.Bold,
//                        color = Color.White
//                    ),
//                    modifier = Modifier.weight(1f)
//                )
//            }
//
//            rounds.forEach { round ->
//                Row(
//                    modifier = Modifier
//                        .background(Color.Black)
//                        .padding(8.dp)
//                ) {
//                    Text(
//                        text = round.first,
//                        style = TextStyle(
//                            fontSize = 14.sp,
//                            fontWeight = FontWeight.Normal,
//                            color = Color.White
//                        ),
//                        modifier = Modifier.weight(1f)
//                    )
//                    Text(
//                        text = round.second,
//                        style = TextStyle(
//                            fontSize = 14.sp,
//                            fontWeight = FontWeight.Normal,
//                            color = Color.White
//                        ),
//                        modifier = Modifier.weight(1f)
//                    )
//                    Text(
//                        text = round.third,
//                        style = TextStyle(
//                            fontSize = 14.sp,
//                            fontWeight = FontWeight.Normal,
//                            color = Color.White
//                        ),
//                        modifier = Modifier.weight(1f)
//                    )
//                }
//            }
//        }
//    }

