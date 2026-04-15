package oop_128409_AdityaZianur.week08

class set_krs(val nim: String, val kodematkul: String?){
    fun matkul_wajib(sks: Int?){
        println("Matkul kamu adalah $kodematkul sksnya $sks")
    }
}

fun main(){
    var nama: String? = "Zian";
    nama = null
    println("Hai $nama")

    val settingKRS = set_krs("123", "OOP")
    println("NIM KAMU: ${settingKRS.nim}, matkul kamu ${settingKRS.kodematkul}")
    settingKRS.matkul_wajib(null)

}