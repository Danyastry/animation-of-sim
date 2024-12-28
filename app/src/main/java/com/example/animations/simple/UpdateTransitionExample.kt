package com.example.animations.simple

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.updateTransition
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
fun UpdateTransitionExample() {
    var currentState by remember { mutableStateOf(false) }
    val transition = updateTransition(targetState = currentState, label = "Example")

    val color by transition.animateColor(label = "Color") { state ->
        if (state) Color.Green else Color.Red
    }
    val size by transition.animateDp(label = "Size") { state ->
        if (state) 200.dp else 100.dp
    }

    Box(
        modifier = Modifier
            .size(size)
            .background(color)
            .clickable { currentState = !currentState }
    )
}