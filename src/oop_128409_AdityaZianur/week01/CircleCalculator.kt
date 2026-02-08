package oop_128409_AdityaZianur.week01

fun main(args: Array<String>){
    val radius = 7.0
    val pi = 3.14

    val area: Double = pi * radius * radius

    println("Radius: $radius, Area: $area")

    println("size: ${checkSize(area)} ")
}

fun checkSize(area: Double) = if (area > 100) "This is a big circle" else "This is a small circle"