package oop_128409_AdityaZianur.week05

class Elective: MataKuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "VR Programming"
        println("Elective ${super.nama} sksnya $sks")
    }

    fun ada_praktek(){
        println("Wajin di praktekin")
    }
}