package com.example.animations.simple

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha

@Composable
fun AnimateFloatExample() {
    var enabled by remember { mutableStateOf(false) }
    val alpha by animateFloatAsState(if (enabled) 1f else 0.5f)

    Text("Hello, World!",
        Modifier.alpha(alpha).clickable { enabled = !enabled }
    )
}