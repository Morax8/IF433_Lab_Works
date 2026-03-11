package oop_128409_AdityaZianur.week06

interface Organisasi {
    val namaOrg: String
    val budgetRapat: Int
    val jmlOrg: Int
    val biayaKonsumsi: Int
        get() = budgetRapat * jmlOrg

    fun rapat()
    fun keaktifan(){
        println("aktif di organisasi")
    }
}