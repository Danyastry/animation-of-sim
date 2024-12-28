package com.example.animations.simple

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AnimateColorExample() {
    var clicked by remember { mutableStateOf(false) }
    val color by animateColorAsState(if (clicked) Color.Green else Color.Red)

    Box(
        modifier = Modifier
            .size(100.dp)
            .background(color)
            .clickable { clicked = !clicked }
    )
}