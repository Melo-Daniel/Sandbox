package com.rugged_robotics.sandboxapp

import com.rugged_robotics.sandboxapp.fakes.FakeCalculationManager
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class CalculatorViewModelTest {

    private lateinit var viewModel: CalculatorViewModel

    @Before
    fun setUp() {
        viewModel = CalculatorViewModel(FakeCalculationManager())
    }

    @Test
    fun addTwoNumbersAndUpdateState() = runBlocking {
        assert(viewModel.state.value.result == 0)
        viewModel.add(1, 1)
        assert(viewModel.state.value.result == 2)
    }
}