package oop_128409_AdityaZianur.week06

class Smartphoe: Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi smartphone berhasil booting")
    }
}