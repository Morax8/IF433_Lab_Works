package oop_128409_AdityaZianur.week05

class Admin(nama: String): Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] ssedang duduk di depan komputer melayani administrasi")
    }

    fun doAdminWork(){
        println("[$nama] sedang merekap data absensi mahasiswa")
    }
}