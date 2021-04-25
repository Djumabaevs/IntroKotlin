package com.example.introkotlin

import kotlin.math.floor

fun main() {
    val stringList : List<String> = listOf("Bakyt", "Talka", "Ono")
    val mixedTypeList: List<Any> = listOf("Hello", 12, 765.9, "755")

    for(value in mixedTypeList) {
        if(value is Int) {
            println("value: $value")
        } else if(value is Double) {
            println("value: $value for floor value: ${floor(value)}")
        } else if (value is String) {
            println("value: $value and length is: ${value.length}")
        } else {
            println("unknown type")
        }
    }
    println("_______________________________________________________")

    //alternatively
    for(value in mixedTypeList) {
        when (value) {
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value for floor value: ${floor(value)}")
            is String ->  println("String: $value and length is: ${value.length}")
            else ->   println("unknown type")
        }
    }

    var obj1: Any = "I have a dream!"
    if(obj1 !is String) {
        println("it is not a string")
    } else {
        println("it is a string of length: ${obj1.length}")
    }

    //unsafe casting
    val str1: String = obj1 as String
    println(str1.length)
    val obj2: Any = 24543
    val str2: String? = obj2 as? String
    print(str2)

}