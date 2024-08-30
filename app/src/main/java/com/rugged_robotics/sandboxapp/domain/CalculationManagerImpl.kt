package com.rugged_robotics.sandboxapp.domain

class CalculationManagerImpl: CalculationManager {
    override fun add(number1: Int, number2: Int): Int {
        return number1 + number2
    }
}