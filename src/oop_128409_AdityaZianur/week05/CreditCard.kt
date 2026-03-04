package oop_128409_AdityaZianur.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran berhasil. Total tagihan saat ini: $usedAmount")
        } else {
            println("Transaksi ditolak")
        }
    }
}