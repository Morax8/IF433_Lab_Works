package oop_128409_AdityaZianur.week10


class rumah(val alamat:Any)

class kampus<T>(val alamat: T)

class Komputer<T, V>(val merk: T, val barcode:V )

fun <T> Passwors(isiPass: T): T {
    return isiPass
}

class kalkulator<T: Number>(val a:T, val b:T){
    fun tambah() : Double{
        return a.toDouble() * b.toDouble()
    }
    fun kurang() : Int{
        return a.toInt() - b.toInt()
    }
}

val daftarNilai = listOf(60,71,90,83,73,67,55,84,72)
fun <T> penilaian(list:List<T>, kkm:T):List<T> where T: Comparable<T>{
    return list.filter {it >= kkm}
}

fun main() {
    println("===== GENERIC - WHERE =====")
    val daftarNilai = listOf(60,71,90,83,73,67,55,84,72)
    println("Daftar nilai : ${daftarNilai}")
    val nilaiAtasKKM = penilaian(daftarNilai, 70)
    println("Nilai diatas KKM : ${nilaiAtasKKM}")

    println("==== GENERIC CONSTRAAINT ====");
    val calc = kalkulator(10,20)
    println("penambahann ${calc.a} dengan ${calc.b}: " + calc.tambah())
    println("pengurangan ${calc.a} dengan ${calc.b}: " + calc.kurang())


    println("==== GENERIC FUNCTION ====");
    println("Password kamu: " + Passwors(122121))



    println("==== GENERIC MULTI PARAM ====");
    val komp = Komputer("Lenovo", 86548654)
    println("merk komputer = " + komp.merk)
    println("barcode= ${komp.barcode}")

    println("==== SAMPLE NON-GENERIC ====");
    val rmh = rumah(alamat = 200);
    val angkaRumah = rmh.alamat as Int
    println(rmh.alamat + 50)

    println("==== SAMPLE GENERIC ====");
    val kmps = kampus(alamat = 300);
    println(kmps.alamat)
}