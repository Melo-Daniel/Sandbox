package com.rugged_robotics.sandboxapp

import androidx.lifecycle.ViewModel
import com.rugged_robotics.sandboxapp.domain.CalculationManager
import com.rugged_robotics.sandboxapp.domain.CalculationManagerImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CalculatorViewModel(private val calculationManager: CalculationManager = CalculationManagerImpl()) :
    ViewModel() {

    private val _state = MutableStateFlow(CalculatorState())
    val state = _state.asStateFlow()

    fun add(number1: Int, number2: Int) {
        val result = calculationManager.add(number1, number2)
        _state.update { it.copy(result = result) }
    }
}