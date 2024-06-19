package com.example.game

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
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
                   // fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(600),
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
                    //fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF0CF285),
                )
            )
        }


        Column(
            modifier = Modifier
                .width(327.dp)
                .height(168.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {
            Row(
                modifier = Modifier
                    .width(327.dp)
                    .height(48.dp)
                    .padding(top = 8.dp, bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Row(
                    modifier = Modifier
                        .width(142.dp)
                        .height(32.dp),
                    horizontalArrangement = Arrangement.spacedBy(11.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        modifier = Modifier
                            .width(32.dp)
                            .height(32.dp)
                            .background(color = Color(0xFFFFFFFF), shape = CircleShape)
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.profile_image),
                        contentDescription = "image description",
                        contentScale = ContentScale.FillBounds
                    )

                    Text(
                        modifier = Modifier
                            .width(99.dp)
                            .height(20.dp),
                        text = "Legend Gamer",
                        style = TextStyle(
                            fontSize = 14.sp,
                            //fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                }

                Row(
                    modifier = Modifier
                        .width(69.dp)
                        .height(32.dp)
                        .background(
                            color = Color(0x3301B752),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        modifier = Modifier
                            .width(37.dp)
                            .height(16.dp),
                        text = "Follow",
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            //fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                }
            }

            Row(
                modifier = Modifier
                    .width(327.dp)
                    .height(48.dp)
                    .padding(top = 8.dp, bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Row(
                    modifier = Modifier
                        .width(142.dp)
                        .height(32.dp),
                    horizontalArrangement = Arrangement.spacedBy(11.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        modifier = Modifier
                            .width(32.dp)
                            .height(32.dp)
                            .background(color = Color(0xFFFFFFFF), shape = CircleShape)
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.profile_image2),
                        contentDescription = "image description",
                        contentScale = ContentScale.FillBounds
                    )

                    Text(
                        modifier = Modifier
                            .width(99.dp)
                            .height(20.dp),
                        text = "Legend Gamer",
                        style = TextStyle(
                            fontSize = 14.sp,
                            //fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                }

                Row(
                    modifier = Modifier
                        .width(69.dp)
                        .height(32.dp)
                        .background(
                            color = Color(0x3301B752),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        modifier = Modifier
                            .width(37.dp)
                            .height(16.dp),
                        text = "Follow",
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            //fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                }
            }

            Row(
                modifier = Modifier
                    .width(327.dp)
                    .height(48.dp)
                    .padding(top = 8.dp, bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Row(
                    modifier = Modifier
                        .width(142.dp)
                        .height(32.dp),
                    horizontalArrangement = Arrangement.spacedBy(11.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        modifier = Modifier
                            .width(32.dp)
                            .height(32.dp)
                            .background(color = Color(0xFFFFFFFF), shape = CircleShape)
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.profile_image3),
                        contentDescription = "image description",
                        contentScale = ContentScale.FillBounds
                    )

                    Text(
                        modifier = Modifier
                            .width(99.dp)
                            .height(20.dp),
                        text = "Legend Gamer",
                        style = TextStyle(
                            fontSize = 14.sp,
                            //fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                }

                Row(
                    modifier = Modifier
                        .width(69.dp)
                        .height(32.dp)
                        .background(
                            color = Color(0x3301B752),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        modifier = Modifier
                            .width(37.dp)
                            .height(16.dp),
                        text = "Follow",
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            //fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                }
            }

        }
    }
}

//
//    Column(
//        modifier = Modifier.padding(16.dp)
//    ) {
//        Text(
//            text = "People to follow",
//            fontWeight = FontWeight.Bold,
//            fontSize = 20.sp,
//            modifier = Modifier.padding(bottom = 8.dp)
//        )
//        FollowCard("Legend Gamer")
//        FollowCard("Legend Gamer")
//        FollowCard("Legend Gamer")
//    }
//}
//
//@Composable
//fun FollowCard(name: String) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 8.dp)
//            .background(Color.LightGray, shape = MaterialTheme.shapes.medium)
//            .padding(16.dp),
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.profile_image), // Replace with actual images
//            contentDescription = name,
//            modifier = Modifier
//                .size(50.dp)
//                .clip(CircleShape),
//            contentScale = ContentScale.Crop
//        )
//        Text(
//            text = name,
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier
//                .padding(start = 16.dp)
//                .weight(1f)
//        )
//        Button(onClick = { /* Handle follow action */ }) {
//            Text(text = "Follow")
//        }
//    }
//}