package oop_128409_AdityaZianur.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    if (isJammed) {
        throw DispenserJamException()
    }
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch (e: DispenserJamException) {
        println("Peringatan ke Pemilik: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Peringatan ke Pemilik: ${e.message}")
    } catch (e: Exception) {
        println("Peringatan ke Pemilik: Terjadi kesalahan tidak terduga. ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
}
