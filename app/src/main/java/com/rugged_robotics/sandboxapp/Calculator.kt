package com.rugged_robotics.sandboxapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun Calculator(viewModel: CalculatorViewModel) {
    val state = viewModel.state.collectAsState().value
    Calculator(state = state, add = viewModel::add)
}

@Composable
fun Calculator(state: CalculatorState, add: (Int, Int) -> Unit) {
    var number1 by remember {
        mutableStateOf("")
    }

    var number2 by remember {
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column {
            OutlinedTextField(
                value = number1,
                onValueChange = { number1 = it },
                modifier = Modifier.testTag("number1")
            )
            OutlinedTextField(
                value = number2,
                onValueChange = { number2 = it },
                modifier = Modifier.testTag("number2")
            )

            Button(onClick = { add(number1.toInt(), number2.toInt()) }) {
                Text(text = "Add")
            }

            Text(text = state.result.toString())
        }
    }
}