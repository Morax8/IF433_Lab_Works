package oop_128409_AdityaZianur.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0){
                println("Error: gahi gaboleh negarig, di set ke 0!")
                field = 0
            } else {
                field = value
            }
        }

    val tax:Double
        get() = salary * 0.1

    private var performanceRating: Int = 3

    fun increasePerformance(){
        performanceRating++
        println("Kinerja $name meningkat! rating : $performanceRating")
    }

    fun printStatus(){
        println("Karyawan $name, rating: $performanceRating")
    }
}

