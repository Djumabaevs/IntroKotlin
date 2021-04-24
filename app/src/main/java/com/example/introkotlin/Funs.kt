package com.example.introkotlin

import java.util.*


fun main() {
   myFunction()
   var res =  average(30.8,3.0)
    print("result is $res")

    var name: String = "Bakyt"
 //   name = null Compilation error

    var name2: String? = "Talka"
   // name2 = null

    var len = name2?.length             //modern way

  /*  if(name2 != null) {                OLD WAY
        var len = name2.length
    } else {
        null
    }*/
println("___________________________________-")
    var surname: String? = "slima"
    surname?.let { print(surname.length) }

    var nullableName: String? = "He"
   // nullableName = null
    val simpleName = nullableName ?: "It"
    print("name is $simpleName")

    print(nullableName!!.toLowerCase(Locale.ROOT))

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

