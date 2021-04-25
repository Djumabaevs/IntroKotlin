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
}

//class ElectricCar : Cars() {    cannot inherit from sealed class
//
//}

fun main() {
    var car = Vehicle("LC200", "Toyota")
    var eCar = Cars("T-300", "Tesla", 100.0)

    car.drive(90.7)
    eCar.drive(76.7)

}

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("Drivable is braking")
    }
}


