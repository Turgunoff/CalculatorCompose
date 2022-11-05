package com.turgunoff.calculatorcompose

/**
 * Created by Eldor Turgunov.
 * Calculator Compose
 * eldorturgunov777@gmail.com
 */
sealed class CalculatorOperation(val symbol: String) {
    object Add : CalculatorOperation("+")
    object Subtract : CalculatorOperation("-")
    object Multiply : CalculatorOperation("*")
    object Divide : CalculatorOperation("/")
    object Percent : CalculatorOperation("%")
}
