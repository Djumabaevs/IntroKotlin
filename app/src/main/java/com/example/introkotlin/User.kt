package com.example.introkotlin

data class User(val name: String, val age: Int)

fun main() {

    val user = User("Bakyt", 35)
    println("name is ${user.name}")
    println("user is : $user")

    var updatedUser = user.copy(name = "Talka")
    println(updatedUser)
    println(updatedUser.component1())
    println(updatedUser.component2())

    val(name, age)  =updatedUser
    println("name=$name, age=$age")
}