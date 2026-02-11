package oop_128409_AdityaZianur.week02

class Student(
    val name: String,
    val nim:String,
    val gpa: Double,
    val major:String,
){
    init {
        if (nim.length != 5){
            println("Warning: Objek tercipta dengan NIM ($nim) yan tidak valid")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("LOG: Objek Student $name berhasil di alokasikan di memori")
        }
    }

    constructor(name: String, nim: String) : this(name, nim, "non-matriculated"){
        println("LOG: menggunakan constructur jalur umum (tanpa jurusan")
    }
}