package com.example.game

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun TournamentByGamesSection() {
    Spacer(modifier = Modifier.height(15.dp))

    Column(
        modifier = Modifier
            .width(328.dp)
            .height(400.dp),
        verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.Top),
        horizontalAlignment = Alignment.Start
    ) {
        Column(
            modifier = Modifier
                .width(328.dp)
                .height(382.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {

            // Play Tournament by games
            Column(
                modifier = Modifier
                    .width(328.dp)
                    .height(257.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                Row(
                    modifier = Modifier
                        .width(328.dp)
                        .height(19.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Top,
                ) {
                    Text(
                        modifier = Modifier
                            .width(212.dp)
                            .height(19.dp),
                        text = "Play Tournament by Games",
                        style = TextStyle(
                            fontSize = 16.sp,
                            //fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(600),
                            color = Color(0xFFF9ECEC),
                        )
                    )
                    Text(
                        modifier = Modifier
                            .width(55.dp)
                            .height(17.dp),
                        text = "View All ",
                        style = TextStyle(
                            fontSize = 14.sp,
                            //fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF0CF285),
                            textAlign = TextAlign.Right,
                        )
                    )
                }

                Column(
                    modifier = Modifier
                        .width(328.dp)
                        .height(214.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                ) {
                    Row(
                        modifier = Modifier
                            .width(328.dp)
                            .height(99.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top,
                    ) {
                        Column(
                            modifier = Modifier
                                .width(100.dp)
                                .height(99.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Image(
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(80.dp),
                                painter = painterResource(id = R.drawable.pubg),
                                contentDescription = "image description",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .width(34.dp)
                                    .height(15.dp),
                                text = "PUBG",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    //fontFamily = FontFamily(Font(R.font.inter)),
                                    fontWeight = FontWeight(500),
                                    color = Color(0xFFFFFFFF),
                                )
                            )
                        }

                        Column(
                            modifier = Modifier
                                .width(100.dp)
                                .height(99.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Image(
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(80.dp),
                                painter = painterResource(id = R.drawable.valorant),
                                contentDescription = "image description",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .width(48.dp)
                                    .height(15.dp),
                                text = "Valorent",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    //fontFamily = FontFamily(Font(R.font.inter)),
                                    fontWeight = FontWeight(500),
                                    color = Color(0xFFFFFFFF),
                                )
                            )
                        }

                        Column(
                            modifier = Modifier
                                .width(100.dp)
                                .height(99.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Image(
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(80.dp),
                                painter = painterResource(id = R.drawable.apex_legends),
                                contentDescription = "image description",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .width(82.dp)
                                    .height(15.dp),
                                text = "Apex Legends",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    //fontFamily = FontFamily(Font(R.font.inter)),
                                    fontWeight = FontWeight(500),
                                    color = Color(0xFFFFFFFF),
                                )
                            )
                        }
                    }

                    Row(
                        modifier = Modifier
                            .width(328.dp)
                            .height(99.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top,
                    ) {
                        Column(
                            modifier = Modifier
                                .width(100.dp)
                                .height(99.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Image(
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(80.dp),
                                painter = painterResource(id = R.drawable.call_of_duty),
                                contentDescription = "image description",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .width(67.dp)
                                    .height(15.dp),
                                text = "Call Of Duty",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    //fontFamily = FontFamily(Font(R.font.inter)),
                                    fontWeight = FontWeight(500),
                                    color = Color(0xFFFFFFFF),
                                )
                            )
                        }

                        Column(
                            modifier = Modifier
                                .width(100.dp)
                                .height(99.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Image(
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(80.dp),
                                painter = painterResource(id = R.drawable.counter_strike),
                                contentDescription = "image description",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .width(83.dp)
                                    .height(15.dp),
                                text = "Counter Strike",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    //fontFamily = FontFamily(Font(R.font.inter)),
                                    fontWeight = FontWeight(500),
                                    color = Color(0xFFFFFFFF),
                                )
                            )
                        }

                        Column(
                            modifier = Modifier
                                .width(100.dp)
                                .height(99.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Image(
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(80.dp),
                                painter = painterResource(id = R.drawable.pubg),
                                contentDescription = "image description",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .width(34.dp)
                                    .height(15.dp),
                                text = "PUBG",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    //fontFamily = FontFamily(Font(R.font.inter)),
                                    fontWeight = FontWeight(500),
                                    color = Color(0xFFFFFFFF),
                                )
                            )
                        }
                    }
                }
            }

            Divider(
                modifier = Modifier
                    .padding(0.dp)
                    .width(328.dp)
                    .height(1.dp)
                    .background(color = Color(0xFF414141))
            )

            // Create Your Tournaments
            Column(
                modifier = Modifier
                    .width(328.dp)
                    .height(85.dp)
                    .background(color = Color(0xFFFFC39B), shape = RoundedCornerShape(8.dp))
                    .padding(8.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = "Create your own tournaments",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xFF091118),
                            )
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Host and manage your own tournaments and play with your friends",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFF4A4A4A),
                            )
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Image(
                        modifier = Modifier
                            .size(60.dp)
                            .graphicsLayer(scaleX = -1f),
                        painter = painterResource(id = R.drawable.game_controller),
                        contentDescription = "Game Controller",
                        contentScale = ContentScale.Fit
                    )
                }
            }
        }
    }
}
