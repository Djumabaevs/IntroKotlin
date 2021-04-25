package com.example.introkotlin

open class Vehicle(val name: String, val brand: String) {

    var range: Double = 0.0
    fun extendRange(amount: Double) {
        if(amount > 0) {
            range += amount
        }
    }
    fun drive(distance: Double) {
        println("Drove for $distance KM")
    }

}
class Cars(name: String, brand: String, batteryLife: Double): Vehicle(name, brand) {

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


