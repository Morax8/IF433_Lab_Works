package oop_128409_AdityaZianur.week03

fun main(){
//    val e = Employee("Budi")
//
//   e.salary = -1000
//   e.salary = 5000000
//   println("Gaji: ${e.salary}")
//
//   e.increasePerformance()
//
//
//   println("Pajak yang harus dibayar: ${e.tax}")

    val wp = Weapon("Axe of Destiny")

    // 1. Coba set damage ke -50 (Harus gagal/tetap nilai lama)
    wp.damage = -50

    // 2. Set damage ke 9999 (Harus terpaksa jadi 1000)
    wp.damage = 9999

    // 3. Print Tier-nya
    println("Tier senjata saat ini: ${wp.tier}")
}