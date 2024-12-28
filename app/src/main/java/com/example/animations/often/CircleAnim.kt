package com.example.animations.often

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.unit.dp

@Composable
fun CircleAnim() {
    val colorBg = Color(0xFF2C3141)
    val colors =
        listOf(
            Color(0xFFFF595A),
            Color(0xFFFFC766),
            Color(0xFF35A07F),
            Color(0xFF35A07F),
            Color(0xFFFFC766),
            Color(0xFFFF595A)
        )
    val brush = Brush.sweepGradient(colors)
    val infiniteTransition = rememberInfiniteTransition()
    val angle by
    infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec =
        infiniteRepeatable(
            animation = tween(1500, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        )
    )

    Canvas(modifier = Modifier.fillMaxWidth().height(50.dp).background(MaterialTheme.colorScheme.background)) {
        rotate(degrees = angle) {
            drawCircle(
                brush = brush,
                radius = size.minDimension,
                blendMode = BlendMode.SrcIn,
            )
        }

        drawRoundRect(
            color = colorBg,
            topLeft = Offset(1.dp.toPx(), 1.dp.toPx()),
            size = Size(
                width = size.minDimension - 2.dp.toPx(),
                height = size.minDimension - 2.dp.toPx()
            ),
            cornerRadius = CornerRadius(
                x = 19.dp.toPx(),
                y = 19.dp.toPx()
            )
        )
    }
}