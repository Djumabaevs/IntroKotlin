package com.example.introkotlin

/*fun main() {
    //TODO: add new functionality
    val world = "world!!!!"
    var age  = 35;
    print("Hello $world")

    val string = "hello"
    val char = string[string.length-1]
    print("$char ")

    val a = 5.0
    val b = 3
    val result:Double = a/b
    println(result)
    println("is grater than  + ${5<3}")
    var num = 35
    print("num is $num")
    print("num is ${num++}")
    print("num is ${++num}")*/
fun main() {

var season = 3
    when(season) {
        1 -> println("spring")
        2 -> println("summer")
        3 -> { println("")
            println("winter") }
        else -> println("invalid season")
    }
    var month = 3
    when(month) {
        in 2..3 -> println("spring")
        in 4..9 -> println("summer")
        in 12 downTo 1 -> println("winter")
        12, 1, 2 -> println("winter")

    }

    var age = 22
    when(age) {
       16, 17 -> println("you can drive now")
       in 18..20 -> println("you can vote now")
       !in 0..20 -> println("you can drink now")
        else -> println("you are too young")
    }

    var x:Any = 23.54
    when(x) {
        is Int -> println("$x is an integer")
        is Double -> println("$x ia a double")
        is String -> println("$x is a string")
    }
}

