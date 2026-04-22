package oop_128409_AdityaZianur.week09

fun main(){
    println("===== List Of Imuttable =====")
    val arrSiswa =listOf("budi", "danu" ,"wirawan", "arya")
    println(arrSiswa)
    println("banyaknya siswa: " + arrSiswa.size)
    println("Siswa bernama ${arrSiswa[1]}")
    for (a in arrSiswa) {
        print("Siswa $a dan ")
    }

    println("\n===== List Of mutable =====")
    var arrMatkul = mutableListOf("OOP", "AWP", "Pemdas", "Kalkulus")
    arrMatkul.add( "Algo")
    arrMatkul[2] = "Aljabar Linier"
    arrMatkul.remove("Pemdas")
    println(arrMatkul)


    println("===== Set Of Imutable =====")
    val arrNilai = setOf(80,90,60,50,80,70,90,100)
    println("banyaknya nilai: " + arrNilai.size)
    println("apakah aada angka 90? ${arrNilai.contains(90)}")
    println(arrNilai)

    println("===== Set Of mutable =====")
    val arrMahasiswa = mutableListOf("yuli", "yanto", "yuda", "udin")
    arrMahasiswa.add("Yanti")
    arrMahasiswa.add("udin")
    arrMahasiswa.remove("udin")
    println(arrMahasiswa)

    println("===== Map Imutable =====")
    val arrResto = mapOf(
        "ayam" to 5000,
        "Bakpao" to 3000,
        "sayur asem" to 2500
    )
    println(arrResto.size)
    println("Harga ayam: ${arrResto["ayam"]}")
    println("Lisr makanan: ${arrResto.keys}")
    println("Lisr Harga: ${arrResto.values}")
    println(arrResto)


    println("===== Map mutable =====")
    val arrKHS = mutableMapOf(
        "toni" to 80,
        "nika" to 85,
        "ara" to 87,
        "davin" to 90
    )
    arrKHS.remove("ara")
    arrKHS["nika"] = 92
    arrKHS["cinta"] = 99
    println(arrKHS)


    println("====== Lambda ======")
    fun tambah(a: Int, b: Int): Int {
        return a + b
    }
    println("hasil penambahan: ${tambah(5, 3)}")
    val kurang = {a: Int, b: Int -> a - b }
    println("hasil pengurangan kurang: ${kurang(5,3)}")

    println("====== Lambda IT ======")
    val pangkat = {a: Int -> a*a}
    val hasilPangkat:(Int) -> Int = {it * it}
    println(hasilPangkat(5))


    println("====== FOREACH biasa ======")
    for (a in arrMatkul) {
        println(a)
    }
    println("====== FOREACH var ======")
    arrMatkul.forEach {
        mk -> println(mk)
    }
}