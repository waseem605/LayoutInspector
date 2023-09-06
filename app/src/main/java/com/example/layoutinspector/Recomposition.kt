package com.example.layoutinspector

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun GoodCounter() {
    var count by remember { mutableStateOf(0) }
    val evenCount = count % 2 == 0
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Count: $count", fontSize = 28.sp, textAlign = TextAlign.Center)
        Text(
            text = if (evenCount) "Even" else "Odd",
            fontSize = 22.sp,
            textAlign = TextAlign.Center
        )
        Button(modifier = Modifier
            .size(width = 200.dp, height = 70.dp) // Set button size
            .padding(16.dp), onClick = { count++ }) {
            Text(
                text = "Increment", fontSize = 18.sp, textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun BadCounter() {
    var count by remember { mutableStateOf(0) }
    val evenCount by remember(count) {
        derivedStateOf {
            count % 2 == 0
        }
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Count: $count", fontSize = 28.sp, textAlign = TextAlign.Center)
        Text(
            text = if (evenCount) "Even" else "Odd",
            fontSize = 22.sp,
            textAlign = TextAlign.Center
        )
        Button(modifier = Modifier
            .size(width = 200.dp, height = 70.dp) // Set button size
            .padding(16.dp), onClick = { count++ }) {
            Text(text = "Increment", fontSize = 18.sp, textAlign = TextAlign.Center)
        }
    }
}
