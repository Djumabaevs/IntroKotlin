package com.example.introkotlin

class Person constructor(name: String, age: Int) {

    var ages: Int? = null
    var hobby: String = "watch Netflix"

    init {
        println("Person created! person name = $name and age = $age")
    }

    fun stateHobby() {
        println("My hobby is $hobby")
    }
}

fun main() {
    var human = Person("Bakyt", 35)
}