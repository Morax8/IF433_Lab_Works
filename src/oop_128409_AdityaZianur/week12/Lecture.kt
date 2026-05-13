package oop_128409_AdityaZianur.week12

fun pembagian(pembilang: Int, penyebut: Int){
    try {
        val hasilBagi = pembilang / penyebut
        println("hasil bagi: $hasilBagi")
    } catch (e: Exception) {
        println("error: $e")
    } finally {
        println("selesai pembagian")
    }

}

fun cek_tipe_data(){
    var angka: Int = try {
        12345
    } catch (e: Exception){
        println("ada error: $e")
        12345
    }

    println("angka: $angka")
}

fun cek_saldo(saldoSaya: Int){
    if (saldoSaya < 1000){
        throw IllegalArgumentException("saldoSaya: $saldoSaya tidak perlu bayar pajak")
    } else {
        println("Selamat anda tidak MISKIN!")
    }
}

class cekNilai(val kkm: Int, val nilai: Int):Exception("Nilai $nilai berada dibawah kkm")

class nilaiSiswa(val kkm: Int){
    fun inputNilai(nilaiKamu: Int){
        if (nilaiKamu < kkm){
            throw cekNilai(kkm, nilaiKamu)
        } else {
            println("kamu lulus dengan nilai $nilaiKamu")
        }
    }

}

fun contohMultipleCatch(nilai: String){
    try {
        val angka = Integer.parseInt(nilai)
        val hasil = angka/2
        println("hasil nilai = $hasil")
    } catch (e: NumberFormatException) {
        println("error salah format ${e.message}")
    } catch (e: ArithmeticException) {
        println("salah aritmatika ${e.message}")
    } catch (e: Exception) {
        println("error program: $e")
    }
}
sealed class ATMException(pesan: String): Exception(pesan)

class saldoDibawahNol(val saldoKamu: Int): ATMException("masa saldo $saldoKamu minus")
class cekJumlahSaldo(val saldoAwal: Int, val jajan: Int): ATMException("saldo tinggal $saldoAwal, kamu jajan $jajan, gacukup woi")

fun mulai_jajan(saldoAwalKamu: Int, jajanKamu: Int):Int {
    if(jajanKamu > saldoAwalKamu) {
        throw cekJumlahSaldo(saldoAwalKamu, jajanKamu)
    } else if (saldoAwalKamu < 0) {
        throw cekJumlahSaldo(saldoAwalKamu, jajanKamu)
    } else {
        println("Transaksi Berhasil!!! ")
    }
    return saldoAwalKamu - jajanKamu
}

fun main(){
    runCatching { mulai_jajan(2000, 1500) }
        .onSuccess { println("sukses, saldo mu siisa $it")}
        .onFailure { println("gagal $it") }

    contohMultipleCatch("20")


    val nsiswa = nilaiSiswa(70)
    try {
        nsiswa.inputNilai(65)
    }
    catch (e: Exception){
        println("error: $e")
    }


    try {
        cek_saldo(900)
    } catch (e: Exception){
        println("error di throw: $e")
    }
    cek_tipe_data()
    pembagian(10,2)
}