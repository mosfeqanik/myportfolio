package com.example.my_portfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(0xFFeeeefb)),
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    My_portfolioTheme {
        Dashboard()
    }
}