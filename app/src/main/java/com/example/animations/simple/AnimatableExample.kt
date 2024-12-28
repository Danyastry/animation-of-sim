package com.example.animations.simple

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.animations.common.format

@Composable
fun AnimatableExample() {
    val animatable = remember { Animatable(0f) }
    var triggerAnimation by remember { mutableStateOf(false) }

    Text(
        text = "Click to Animate: ${animatable.value.format(2)}",
        modifier = Modifier
            .padding(16.dp)
            .clickable {
                triggerAnimation = !triggerAnimation
            }
    )

    LaunchedEffect(triggerAnimation) {
        animatable.animateTo(
            targetValue = if (triggerAnimation) 1f else 0f,
            animationSpec = tween(durationMillis = 1000, easing = LinearOutSlowInEasing)
        )
    }
}

