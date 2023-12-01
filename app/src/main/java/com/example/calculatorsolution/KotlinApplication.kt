package com.example.calculatorsolution

fun main(){
    var num1 = readLine()!!.toDouble()
    var num2 = readLine()!!.toDouble()

    val addCalc = Calculator(AddOperation())
    println("num1 더하기 num2 결과는 : ${addCalc.operate(num1, num2)}입니다")

    val subCalc = Calculator(SubstractOperation())
    println("num1 빼기 num2 결과는 : ${subCalc.operate(num1,num2)}입니다")

    val mulCalc = Calculator(MultiplyOperation())
    println("num1 곱하기 num2 결과는 : ${mulCalc.operate(num1,num2)}입니다")

    val divCalc = Calculator(DivideOperation())
    println("num1 나누기 num2 결과는 : ${divCalc.operate(num1,num2)}입니다")
}