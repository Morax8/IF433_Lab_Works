package oop_128409_AdityaZianur.week08

class Alamat(val nomor: Int, val kota: String)
class Mahasiswa(val nim: String, val addr: Alamat?)

fun main(){
    val almt = Alamat(67,"Tangerang")
    val mhs = Mahasiswa("0987", almt)

    val defaultAlamat = mhs.addr?.let {
        alamatAsli -> " sini nih..${mhs.addr.kota} nomornya ${mhs.addr.kota}"

    }?: "Gak jelas gatau dmn"

    println("Nim nya ${mhs.nim} tinggalnya di ${mhs.addr?.kota}")
}