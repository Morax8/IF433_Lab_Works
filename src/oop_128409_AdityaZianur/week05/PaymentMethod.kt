package oop_128409_AdityaZianur.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}