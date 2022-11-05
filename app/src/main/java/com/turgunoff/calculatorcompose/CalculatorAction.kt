package com.turgunoff.calculatorcompose

/**
 * Created by Eldor Turgunov.
 * Calculator Compose
 * eldorturgunov777@gmail.com
 */
sealed class CalculatorAction {
    data class Number(val number: Int) : CalculatorAction()
    object Clear : CalculatorAction()
    object Delete : CalculatorAction()
    object Decimal : CalculatorAction()
    object Calculate : CalculatorAction()
    data class Operation(val operation: CalculatorOperation) : CalculatorAction()
}