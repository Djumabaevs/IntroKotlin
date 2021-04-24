package com.example.introkotlin

import java.lang.IllegalArgumentException
import java.util.*

class Person constructor(name: String, age: Int) {
/*
    var ages: Int? = null
    var hobby: String = "watch Netflix"*/

    var age: Int? = null
    var hobby = "watch Netflix"
    var name: String? = null

    constructor(name: String, age: Int, hobby: String): this(name, age) {
        this.hobby = hobby
    }

    init {
        this.name = name
        println("Person created! person name = $name and age = $age")
    }

    fun stateHobby() {
        println("$name\'s hobby is to $hobby")
    }

}

fun main() {
    var human = Person("Bakyt", 35)
    var human2 = Person("Bakyt", 35, "Coding")

    human2.age = 36

    human.stateHobby()

    println("age of human2 is ${human2.age}")

    var myCar = Car()
    myCar.owner
    println("brand of the car is ${myCar.brand}")
    myCar.maxSpeed = 560
    println("max speed of the car is ${myCar.maxSpeed}")
    println("model is ${myCar.model}")
    //myCar.model = "ferrari"  cannot set value because of private setter
}

class Car() {
    lateinit var owner: String

    val brand: String = "LEXUS"
//custom getter
    get() {
        return field.toLowerCase(Locale.ROOT)
    }

    var maxSpeed: Int = 300
    get() = field
    set(value) {
        field = if(value > 0) value else throw IllegalArgumentException("speed must be positive number")
    }

    var model: String = "Ferrari"
    private set

    init {
        this.model = "bugatti"
        this.owner = "Tushka"
    }

}