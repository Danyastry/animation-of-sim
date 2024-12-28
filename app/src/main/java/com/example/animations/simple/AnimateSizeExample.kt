package com.example.animations.simple

import androidx.compose.animation.core.animateSizeAsState
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
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AnimateSizeExample() {
    var expanded by remember { mutableStateOf(false) }
    val size by animateSizeAsState(if (expanded) Size(200f, 200f) else Size(100f, 100f))

    Box(modifier = Modifier
        .size(size.width.dp, size.height.dp)
        .background(Color.Magenta)
        .clickable { expanded = !expanded })
}