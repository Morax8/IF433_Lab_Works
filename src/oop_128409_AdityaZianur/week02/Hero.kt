package oop_128409_AdityaZianur.week02

import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName dengan damage $baseDamage!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
        println("$name terkena damage $damage. Sisa HP: $hp")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    val enemyName = "The Void King"
    var enemyHp = 100

    print("Masukkan nama Hero-mu: ")
    val heroName = sc.nextLine()
    print("Masukkan base damage Hero: ")
    val heroDamage = sc.nextInt()

    val myHero = Hero(heroName, heroDamage)

    println("\n--- BATTLE START: $heroName VS $enemyName ---")

    while (myHero.isAlive() && enemyHp > 0) {
        println("\nMenu: 1. Serang, 2. Kabur")
        print("Pilih aksi: ")
        val choice = sc.nextInt()

        if (choice == 1) {
            myHero.attack(enemyName)
            enemyHp -= myHero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val randomDamage = (10..20).random()
                println("\n$enemyName menyerang balik!")
                myHero.takeDamage(randomDamage)
            }
        } else if (choice == 2) {
            println("Kamu melarikan diri dari pertempuran!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n--- BATTLE END ---")
    if (myHero.isAlive() && enemyHp <= 0) {
        println("Selamat! $heroName berhasil mengalahkan $enemyName!")
    } else if (!myHero.isAlive()) {
        println("Yah, $heroName telah gugur di medan perang...")
    } else {
        println("Pertempuran berakhir tanpa pemenang (Kabur).")
    }
}