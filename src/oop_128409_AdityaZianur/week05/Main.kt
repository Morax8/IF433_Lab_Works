package oop_128409_AdityaZianur.week05

fun main(){
    val dosen1 = Dosen("Pak Alek", "09876534")
    val admin1 = Admin("Bu suti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when(pegawai){
            is Dosen -> {
                println("Terdetksi sebagai dosen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar()
            }

            is Admin -> {
                println("terdeteksi sebagai admin")
                pegawai.doAdminWork()
            }
        }

        println("--------------------------------")
    }
}