package oop_128409_AdityaZianur.week06

//fun processCheckout(method: PaymentMethod, amount: Double){
//    println("-> Memulai Checkout...")
//    method.pay(amount)
//}

fun main(){
    val lampu = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lampu)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== MENGAKTIFKAN SECURITY MODE ===")
    hub.activateSecurityMode()

    println("\n=== MEMATIKAN SEMUA PERANGKAT ===")
    hub.turnOffAllSwitches()

//    val myWatch = Smartwatch()
//    myWatch.showTime()
//
//    val myPhone = Smartphoe()
//    myPhone.turnOn()
//
//    val pay1 = Gopay()
//    val pay2 = CreditCard()
//
//    println("\n=== Testing Checkout ===")
//    processCheckout(pay1, 50000.0)
//    processCheckout(pay2, 150000.0)

}