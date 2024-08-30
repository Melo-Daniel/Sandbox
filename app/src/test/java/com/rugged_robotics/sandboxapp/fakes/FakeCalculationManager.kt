package com.rugged_robotics.sandboxapp.fakes

import com.rugged_robotics.sandboxapp.domain.CalculationManager

class FakeCalculationManager : CalculationManager {

    override fun add(number1: Int, number2: Int): Int {
        return number1 + number2
    }
}