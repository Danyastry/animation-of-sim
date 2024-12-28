package com.example.animations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.animations.often.CardWithAnimatedBorder
import com.example.animations.often.CircleAnim
import com.example.animations.simple.AnimatableExample
import com.example.animations.simple.AnimateColorExample
import com.example.animations.simple.AnimateDpExample
import com.example.animations.simple.AnimateFloatExample
import com.example.animations.simple.AnimateSizeExample
import com.example.animations.simple.AnimatedVisibilityExample
import com.example.animations.simple.CrossfadeExample
import com.example.animations.simple.RememberInfiniteTransitionExample
import com.example.animations.simple.UpdateTransitionExample
import com.example.animations.ui.theme.AnimationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AnimationsTheme {
                val scrollState = rememberScrollState()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(scrollState)
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(20.dp)
                    ) {
                        CardWithAnimatedBorder {}
                        CircleAnim()
                        AnimateColorExample()
                        AnimateDpExample()
                        AnimateFloatExample()
                        AnimateSizeExample()
                        UpdateTransitionExample()
                        AnimatedVisibilityExample()
                        CrossfadeExample()
                        AnimatableExample()
                        RememberInfiniteTransitionExample()
                    }
                }
            }
        }
    }
}
