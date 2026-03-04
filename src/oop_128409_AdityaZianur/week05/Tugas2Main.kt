package oop_128409_AdityaZianur.week05

fun main() {
    val eWallet = EWallet("EWallet Zian", 50000.0)
    val creditCard = CreditCard("Credit Card Zian", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (method in paymentMethods) {
        println("Memproses pembayaran untuk: ${method.accountName}")
        method.processPayment(75000.0)

        if (method is EWallet) {
            method.topUp(50000.0)
            method.processPayment(75000.0)
        }
        println("")
    }
}