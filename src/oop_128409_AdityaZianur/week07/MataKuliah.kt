package oop_128409_AdityaZianur.week07

enum class MataKuliah(val jmlSks: Int) {
    OOP(3),
    GAMEDEV(4),
    DASPRO(2);


    fun sks_matkul(){
        println("Jumlah sks nyaL $jmlSks")
    }
}