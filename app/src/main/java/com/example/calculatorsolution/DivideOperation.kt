package com.example.calculatorsolution

class DivideOperation:AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
        require(num2 != 0.0) {
            ArithmeticException("Divide By Zero")
        }
        return (num1/num2).toDouble()
    }
}