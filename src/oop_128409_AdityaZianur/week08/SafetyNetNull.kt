package oop_128409_AdityaZianur.week08

fun main(){
    var nama: String? = "budi"

    try {
        println("Nama kamu ${nama!!.uppercase()}")
    } catch (ex: NullPointerException) {
        println("Erorn: ${ex.message}")
    }

    var dataMhs: List<Any> = listOf(123, "Zian", 69, "Tangerang")
    for (item in dataMhs) {
        var itemFilter = item as? String
        if (itemFilter != null) {
            println(itemFilter)
        }
    }
}