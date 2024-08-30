package com.rugged_robotics.sandboxapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.rugged_robotics.sandboxapp.ui.theme.SandboxAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel by viewModels<CalculatorViewModel>()
        setContent {
            SandboxAppTheme {
                Calculator(viewModel)
            }
        }
    }
}