package oop_128409_AdityaZianur.week04

fun main() {
//    println("--- TESTING VEHICLE ---")
//    val generalVehicle = Vehicle("Sepeda Listrik")
//    generalVehicle.honk()
//    generalVehicle.accelerate()
//
//    println("\n--- TESTING CAR2 ---")
//    val myCar = Car("Toyota", 4)
//    myCar.openTrunk()
//    myCar.honk()
//    myCar.accelerate()
//
//    println("\n--- TESTING E-Car ---")
//    val Ecar = ElectricCar("Tesla", 4, 80)
//    Ecar.accelerate()
//    Ecar.honk()
//    Ecar.openTrunk()

    val Mng = Manager("Tono", 50000000)
    Mng.work()
    println("Bonus Tono: Rp ${Mng.calculateBonus()}")

    val dev = Developer("Jono", 20000000, "Kotlin")
    dev.work()
    println("Bonus Jono: Rp ${dev.calculateBonus()}")
}