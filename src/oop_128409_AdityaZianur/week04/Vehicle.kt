package oop_128409_AdityaZianur.week04

open class Vehicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("$brand melaju,  Kecepatan: $speed km/h")
    }

    open fun honk(){
        println("BEEP BEEP!")
    }

}