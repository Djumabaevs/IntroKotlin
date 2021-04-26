package com.example.introkotlin

import java.lang.ArithmeticException
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

    println("__________________________________________________")

    val list: ArrayList<Double> = ArrayList();
    list.add(23.45)
    list.add(34.54)
    list.add(72.09)
    list.add(1343.2)
    list.add(98.46207)
    var total = 0.0
    for(i in list) {
        total += i
    }
    var avg = total / list.size
    println("average is $avg")

    val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
    println(sum(10,5))
    val sum2 = {a: Int, b: Int -> println(a + b)}
    sum(10,5)

    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)

    fun getNumber(str: String): Int {
        return try {
            Integer.parseInt(str)
        } catch(e: ArithmeticException){
            0
        }
    }

    val str = getNumber("10")
    println(str)
}