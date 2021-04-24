package com.example.introkotlin


fun main() {
   myFunction()
   var res =  average(30.8,3.0)
    print("result is $res")
}

fun myFunction() {
    print("hello")
}

fun addNum(a: Int, b: Int): Int {
    return a+b
}

fun average(a: Double, b: Double): Double {
    return (a + b) / 2
}