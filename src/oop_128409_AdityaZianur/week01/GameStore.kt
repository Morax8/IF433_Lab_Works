package oop_128409_AdityaZianur.week01

fun main(){
    val gameTitle = "Elden Ring"
    val price = 599000

    val hargaDiskon = calculateDiscount(price)

    printReceipt(title = gameTitle, finalPrice = hargaDiskon)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(title: String, finalPrice: Int) {
    println("--- STRUK PEMBELIAN ---")
    println("Judul Game : $title")
    println("Total Bayar: Rp $finalPrice")
}