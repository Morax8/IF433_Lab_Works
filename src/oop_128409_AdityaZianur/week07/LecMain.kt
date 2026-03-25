package oop_128409_AdityaZianur.week07

fun main (){
    println("Server: ${Koneksi.linkServer}")
    Koneksi.test_koneksi()

    Mahasiswa.nama = "udin"
    val na: Int = Mahasiswa.set_nilai(80,90)
    println("Nilai ${Mahasiswa.nama} adlaah $na")


    Mahasiswa.isi_nama_kampus("UMN")


    val dosen1= Dosen("indah", "12345", 2020)
    println(dosen1)

    val dosen2 = dosen1.copy("budi,","456321")
    println(dosen2)

    println("Nama dosen 1 = ${dosen1.nama}, masuk tahun ${dosen1.thnMasuk}")

    println("Mata kuliah fav says : " + MataKuliah.OOP)
    println("Index matkul saya : " + MataKuliah.OOP.ordinal)

    MataKuliah.OOP.sks_matkul()

    for (matkul in MataKuliah.entries){
        println("Matkul: $matkul")
        matkul.sks_matkul()
    }
}