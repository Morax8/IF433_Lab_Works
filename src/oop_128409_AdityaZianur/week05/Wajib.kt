package oop_128409_AdityaZianur.week05

class Wajib: MataKuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "OOP"
        println("Matkul ${super.nama} sksnya $sks")
    }

    fun ada_seminar(){
        println("Wajib ada seminar")
    }
}