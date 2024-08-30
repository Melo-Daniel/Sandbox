package com.rugged_robotics.sandboxapp.domain

import org.junit.Before
import org.junit.Test

class CalculationManagerImplTest {

    private lateinit var calculationManager: CalculationManager

    @Before
    fun setUp() {
        calculationManager = CalculationManagerImpl()
    }

    @Test
    fun add() {
        val result = calculationManager.add(1, 1)
        assert(result == 2)
    }
}