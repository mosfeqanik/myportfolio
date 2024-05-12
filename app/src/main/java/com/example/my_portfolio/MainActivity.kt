package com.example.my_portfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.my_portfolio.ui.theme.My_portfolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Dashboard()
        }
    }
}

@Composable
fun Dashboard() {
    Surface(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(0xFFeeeefb)),
    ) {
        {
//        ConstraintLayout {
//            val (topImg, profile) = createRefs()
//            Box(
//                Modifier
//                    .fillMaxWidth()
//                    .height(245.dp)
//                    .constrainAs(topImg) {
//                        top.linkTo(parent.top)
//                        start.linkTo(parent.start)
//                    }
//                    .background(
//                        color = Color(0xFF5e3bee),
//                        shape = RoundedCornerShape(bottomEnd = 40.dp, bottomStart = 40.dp)
//                    )
//            ) {
//                Row(
//                    modifier = Modifier
//                        .padding(
//                            top = 48.dp, start =
//                            24.dp, end = 24.dp
//                        )
//                        .fillMaxWidth()
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .height(100.dp)
//                            .padding(start = 14.dp)
//                            .weight(0.7f),
//                        verticalArrangement = Arrangement.Center,
//                        horizontalAlignment = Alignment.Start
//                    ) {
//                        Text(
//                            text = "hello",
//                            color = Color.White,
//                            fontSize = 22.sp,
//                        )
//                        Text(
//                            text = "David FriedMan",
//                            color = Color.White,
//                            fontSize = 22.sp,
//                            fontWeight = FontWeight.Bold,
//                            modifier = Modifier.padding(top = 14.dp)
//                        )
//                    }
//                    Image(
//                        painter = painterResource(id = R.drawable.profile),
//                        contentDescription = null,
//                        modifier = Modifier
//                            .width(100.dp)
//                            .height(100.dp)
//                            .clickable { }
//
//                    )
//                }
//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.Center,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(top = 24.dp, start = 24.dp, end = 24.dp)
//                        .shadow(3.dp,
//                            shape = RoundedCornerShape(20.dp)
//                        )
////                        .constrainAs(profile) {
////                            top.linkTo(topImg.bottom)
////                            bottom.linkTo(topImg.bottom)
////                            start.linkTo(parent.start)
////                            end.linkTo(parent.end)
////                        }
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .padding(top = 12.dp, bottom = 12.dp, end = 12.dp)
//                            .height(90.dp)
//                            .width(90.dp)
//                            .background(
//                                color = Color(0xFFb6c2fe),
//                                shape = RoundedCornerShape(20.dp)
//                            ),
//                        ) {
//
//                    }
//
//                }
//
//            }
//        }
        }
        Column {
            BoxExample()
        }

    }
}

@Composable
fun BoxExample() {
    Box {
        Surface(
            color = Color(0xFF5e3bee),
            shape = RoundedCornerShape(
                bottomEnd = 25.dp,
                bottomStart = 25.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(
                        top = 48.dp, start =
                        24.dp, end = 24.dp
                    )
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .height(100.dp)
                        .padding(start = 14.dp)
                        .weight(0.7f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Hello",
                        color = Color.White,
                        fontSize = 22.sp,
                    )
                    Text(
                        text = "David FriedMan",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 14.dp)
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = null,
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .clickable { }

                )
            }

        }
        Box {
            Surface(
                color = Color(0xFFC4C4C5),
                shape = RoundedCornerShape(percent = 10),
                modifier = Modifier
                    .fillMaxWidth()
                    .width(100.dp)
                    .padding(top = 150.dp, start = 24.dp, end = 24.dp)
                    .height(100.dp)

            )
            {
                Row {
                    Column {
                        Text(text = "anik")
                        Text(text = "anik")
                        Text(text = "anik")
                        Text(text = "anik")
                    }
                    Column {
                        Text(text = "anik")
                        Text(text = "anik")
                        Text(text = "anik")
                        Text(text = "anik")
                    }
                    Column {
                        Text(text = "anik")
                        Text(text = "anik")
                        Text(text = "anik")
                        Text(text = "anik")
                    }
                }

            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    My_portfolioTheme {
        Dashboard()
    }
}