package oop_128409_AdityaZianur.week02

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1,
) {
    init {
        println("Nama buku: $bookTitle")
        println("Nama peminjam: $borrower")
        println("Durasi peminjaman: $loanDuration")

    }

    fun calculateFine():Int{
        var fine = 0
        if (loanDuration > 3){
            fine = (loanDuration - 3) * 2000
        }

        return fine
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    print("Masukkan judul buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan nama peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan durasi peminjaman: ")
    val loanDuration = scanner.nextInt()

    if (loanDuration <= 0){
        println("Durasi peminjaman tidak boleh minus")
    }

    var pinjamBuku = Loan(bookTitle, borrower, loanDuration)

    println("Denda: ${pinjamBuku.calculateFine()}")
}