package oop_128409_AdityaZianur.week05

fun main() {
    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(4, 6)
    println("Luas Persegi Panjang (4 x 6): $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari 7.0): $luasLingkaran")
}