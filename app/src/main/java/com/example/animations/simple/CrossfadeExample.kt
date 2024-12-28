package com.example.animations.simple

import androidx.compose.animation.Crossfade
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun CrossfadeExample() {
    var currentPage by remember { mutableStateOf("A") }
    Crossfade(targetState = currentPage) { screen ->
        when (screen) {
            "A" -> Text("Page A")
            "B" -> Text("Page B")
        }
    }
    Button(onClick = { currentPage = if (currentPage == "A") "B" else "A" }) {
        Text("Change Page")
    }
}