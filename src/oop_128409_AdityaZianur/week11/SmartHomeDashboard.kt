package oop_128409_AdityaZianur.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    // Konfigurasi Pencahayaan
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    // Konfigurasi Keamanan
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    // Konfigurasi AC & Kabel
    val acUnit = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acUnit)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    // Pencarian Aman dengan let
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }

    // Format Summary dengan with
    with(homeDevices) {
        println("\n=== SMART HOME SUMMARY ===")
        println("Total perangkat terdaftar: ${this.size}")
    }
}
