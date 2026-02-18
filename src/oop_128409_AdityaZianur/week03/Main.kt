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
    val p1 = Player("Zian")

    wp.damage = -50

    wp.damage = 9999

    println("Tier senjata saat ini: ${wp.tier}")

    p1.addXp(50)
    println("Level saat ini: ${p1.level}")

    p1.addXp(60)
}