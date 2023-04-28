package com.samirmaciel.jetpackcompose_noteone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.samirmaciel.jetpackcompose_noteone.View.HomeScreen
import com.samirmaciel.jetpackcompose_noteone.ui.theme.JetpackComposeNoteOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeNoteOneTheme {
                HomeScreen()
            }
        }
    }
}
