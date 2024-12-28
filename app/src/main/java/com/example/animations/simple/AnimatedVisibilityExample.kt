package com.example.animations.simple

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun AnimatedVisibilityExample() {
    var visible by remember { mutableStateOf(true) }
    Column {
        AnimatedVisibility(visible = visible) {
            Text("Hello, I might disappear. Click the button below!")
        }
        Button(onClick = { visible = !visible }) {
            Text("Toggle Visibility")
        }
    }
}