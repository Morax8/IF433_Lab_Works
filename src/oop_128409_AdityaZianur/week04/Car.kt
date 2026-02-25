package oop_128409_AdityaZianur.week04

open class Car(brand: String, val numberOfDoors: Int): Vehicle(brand) {
    fun openTrunk(){
        println("bagasi mobil $brand dengan $numberOfDoors pintu dibuka")
    }
}