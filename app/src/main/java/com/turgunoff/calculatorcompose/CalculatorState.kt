package com.turgunoff.calculatorcompose

/**
 * Created by Eldor Turgunov.
 * Calculator Compose
 * eldorturgunov777@gmail.com
 */
data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
