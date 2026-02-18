package oop_128409_AdityaZianur.week03

import java.util.Scanner

open class bapake{
    private var nama:String = "Belum tau"
    private var umur: Int = 35
    var gaji: Int = 50000000

    public var uangjajan:Int = 0
    set(value) {
        if (value <= 0){
            println("uang jajan tdk boleh dibawah 0")
        } else{
            field = value
        }
    }get(){
        return field + 123
    }


    public fun set_nama(namabaru: String){
        if(this.nama.length == 0){
            println("Nama tidak boleh kosong")
        } else {
            this.nama = namabaru
        }
    }

    public fun get_nama():String{
        return this.nama
    }

    public fun set_umur(umurbaru: Int){
        if(umurbaru <= 0){
            println("Umur tidak boleh kosong dan dibawah 0 ")
        } else {
            this.umur = umurbaru
        }
    }

    public fun get_umur(): Int{
        return this.umur
    }
}


class anake: bapake(){
    fun dapetin_gaji_bapak():Int
    {
        return this.gaji
    }
}

fun main(){
    val scan = Scanner(System.`in`)
//    val bpk = bapake()
//
//    print("Masukan nama bapakmu: ")
//    val newNamaBapak = scan.nextLine()
//    bpk.set_nama(newNamaBapak)
//
//    print("Masukan umur bapakmu: ")
//    val newUmurBapak = scan.nextInt()
//    bpk.set_umur(newUmurBapak)
//
//
//    println("nama bapakmu: ${ bpk.get_nama() } dan umur bapakmu ${bpk.get_umur()}")

    var ank = anake()
    ank.set_nama("Zian")
    println("namamu : ${ank.get_nama()} ")
    println("gaji bapak adalah ${ank.dapetin_gaji_bapak()}")

    ank.uangjajan = -100
}