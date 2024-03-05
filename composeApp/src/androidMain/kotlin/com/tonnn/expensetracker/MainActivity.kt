package com.tonnn.expensetracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ui.screens.loading.LoadingScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LoadingScreen()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    LoadingScreen()
}