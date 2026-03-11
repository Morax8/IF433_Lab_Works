package oop_128409_AdityaZianur.week06

class Gopay: PaymentMethod {
    override fun pay(amount: Double) {
        println("processing Rp$amount via gopay")
    }
}

class CreditCard: PaymentMethod {
    override fun pay(amount: Double) {
        println("Contacting bank for RP$amount")
    }
}