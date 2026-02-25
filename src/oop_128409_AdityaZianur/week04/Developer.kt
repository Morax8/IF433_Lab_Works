package oop_128409_AdityaZianur.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding pake bahasa $programmingLanguage")
    }
}