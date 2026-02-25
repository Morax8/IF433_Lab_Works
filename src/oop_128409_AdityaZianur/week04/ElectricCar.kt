package oop_128409_AdityaZianur.week04

open class ElectricCar(brand: String, numberOfDoors: Int, var batteryCapacity: Int): Car(brand, numberOfDoors) {
    final override fun accelerate() {
        println("$brand berakselerasi dengan sunyi. Kapasitas baterai $batteryCapacity%")
    }

}