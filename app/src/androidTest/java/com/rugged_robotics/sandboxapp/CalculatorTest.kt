package com.rugged_robotics.sandboxapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.rugged_robotics.sandboxapp.ui.theme.SandboxAppTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class CalculatorTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private lateinit var viewModel: CalculatorViewModel

    @Before
    fun setup() {
        viewModel = CalculatorViewModel()
    }

    @Test
    fun testAddition() {
        composeTestRule.setContent {
            SandboxAppTheme {
                Calculator(viewModel)
            }
        }

        composeTestRule.onNodeWithText("0").assertIsDisplayed()

        composeTestRule.onNodeWithTag("number1").performTextInput("1")
        composeTestRule.onNodeWithTag("number2").performTextInput("1")

        composeTestRule.onNodeWithText("Add").performClick()
        composeTestRule.onNodeWithText("2").assertIsDisplayed()
    }
}