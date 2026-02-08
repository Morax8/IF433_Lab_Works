package oop_128409_AdityaZianur.week01


fun main(){
    var name: String = "Aditya Zianur"
    var score: Int = 80

     println("nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }

    println("grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) = if (score . 75) "Lulus" else "Tidak Lulus"