package com.example.game

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun CompeteInBattles() {
    Spacer(modifier = Modifier.height(10.dp))
    Column(
        modifier = Modifier
            .width(328.dp)
            .height(342.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
        horizontalAlignment = Alignment.Start,
    ) {
        Row(
            modifier = Modifier
                .width(328.dp)
                .height(19.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom,
        ) {
            Text(
                text = "Compete in Battles",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFFF9ECEC),
                )
            )
            Text(
                text = "View All",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF0CF285),
                ),
                textAlign = TextAlign.Right
            )
        }

        Row(
            modifier = Modifier
                .width(328.dp)
                .height(299.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.Top,
        ) {
            BattleCard()
            BattleCard() // Duplicate or create another similar BattleCard for a second card
        }
    }
}

@Composable
fun BattleCard() {
    Box(
        modifier = Modifier
            .width(240.dp)
            .height(299.dp)
            .border(
                width = 1.dp,
                color = Color(0x66FFFFFF),
                shape = RoundedCornerShape(8.dp)
            )
            .background(
                color = Color(0x004BACCA),
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Box {
                Image(
                    modifier = Modifier
                        .width(250.dp)
                        .height(158.dp),
                    painter = painterResource(id = R.drawable.compete_in_battles),
                    contentDescription = "image description",
                    contentScale = ContentScale.Crop
                )
                Row(
                    modifier = Modifier
                        .padding(4.dp)
                        .width(240.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        modifier = Modifier
                            .background(
                                color = Color(0xCC001208),
                                shape = RoundedCornerShape(16.dp)
                            )
                            .padding(horizontal = 4.dp, vertical = 4.dp),
                        text = "Registration Open",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFFFFFFFF),
                        )
                    )

                    Row(
                        Modifier
                            .background(
                                color = Color(0xCC001208),
                                shape = RoundedCornerShape(size = 16.dp)
                            )
                            .padding(start = 8.dp, top = 2.dp, end = 8.dp, bottom = 2.dp),
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.twemoji_trophy),
                            contentDescription = "image description",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .size(11.dp)
                        )
                        Text(
                            text = "10000",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFFFFFFFF),
                            ),
                        )
                        Image(
                            painter = painterResource(id = R.drawable.twemoji_coin),
                            contentDescription = "image description",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .size(11.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                modifier = Modifier.width(210.dp),
                text = "PUBG Tournament By Red Bull",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFFFFFFFF),
                )
            )
            Spacer(modifier = Modifier.height(4.dp))

            Row(
                modifier = Modifier.height(16.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    modifier = Modifier.size(12.dp),
                    painter = painterResource(id = R.drawable.uimcalender),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds
                )
                Text(
                    text = "Jun 26 - Jun 27, 2024",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFFDADADA),
                    )
                )
            }
            Spacer(modifier = Modifier.height(15.dp))

            Row(
                modifier = Modifier.height(15.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Entry - 10",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFFFFFFFF),
                    )
                )
                Image(
                    modifier = Modifier
                        .padding(1.dp)
                        .size(10.dp),
                    painter = painterResource(id = R.drawable.twemoji_coin),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds
                )
            }
            Spacer(modifier = Modifier.height(18.dp))

            Row(
                modifier = Modifier.height(24.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    modifier = Modifier.width(170.dp),
                    text = "See Tournament Details",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFFFFFFFF),
                    )
                )
                Image(
                    modifier = Modifier
                        .padding(1.dp)
                        .size(20.dp)
                        .background(color = Color(0xFF01B752), shape = CircleShape)
                        .clip(CircleShape),
                    painter = painterResource(id = R.drawable.ph_arrow),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
}
