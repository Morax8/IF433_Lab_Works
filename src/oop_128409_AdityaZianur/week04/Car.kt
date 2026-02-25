package oop_128409_AdityaZianur.week04

open class Car(brand: String, val numberOfDoors: Int): Vehicle(brand) {
    fun openTrunk(){
        println("bagasi mobil $brand dengan $numberOfDoors pintu dibuka")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand mau lewat")
    }

    override fun accelerate() {
        super.accelerate()
        println("mobil $brand meggunakan transmisi gigi untuk menambha kecepatan")
    }
}