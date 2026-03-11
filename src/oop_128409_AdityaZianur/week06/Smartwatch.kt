package oop_128409_AdityaZianur.week06

class Smartwatch:Watch(), BluetoothCOnnectable, Rechargeable {

    override fun showTime() {
        println("Layar menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat sekitar untuk pairing")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunaan charger magentic")
    }
}