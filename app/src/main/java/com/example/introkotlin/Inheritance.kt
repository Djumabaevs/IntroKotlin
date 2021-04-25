package com.example.introkotlin

open class Vehicle(override val maxSpeed: Double, name: String, val brand: String): Drivable {

    open var range: Double = 0.0
    fun extendRange(amount: Double) {
        if(amount > 0) {
            range += amount
        }
    }
    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }

    override fun drive(): String = "driving interface"

    /*override fun drive(): String {
        return "driving interface"
    }*/

}
class Cars(maxSpeed: Double, name: String, brand: String, batteryLife: Double): Vehicle(maxSpeed, name, brand) {
    override var range = batteryLife * 6
    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String = "drove for $range km on electricity"
    override fun brake() {
        super.brake()
        println("braking is cool")
    }
}

//class ElectricCar : Cars() {    cannot inherit from sealed class
//
//}

fun main() {
    var car = Vehicle(300.0,"LC200", "Toyota")
    var eCar = Cars(340.5, "T-300", "Tesla", 100.0)

    car.drive(90.7)
    eCar.drive(76.7)
    println("-------------------------")
    eCar.brake()
    println("-------------------------")
    car.brake()

}

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("Drivable is braking")
      }
    }
abstract class Mammal(private val name: String, private val origin: String, private val weight: Double) {
    abstract var maxSpeed: Double //must be overridden by subclasses
    abstract fun breath() //must be implemented by subclasses
    abstract fun run()

    //concrete method
    fun display() {
        println("max speed: $maxSpeed +  name: $name, origin: $origin, weight: $weight ")
    }
}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun breath() {
        println("breathe every second")
    }

    override fun run() {
        println("run on two legs")
    }
}



