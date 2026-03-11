package oop_128409_AdityaZianur.week06

class Button(override val name: String) :Clickable {
    override fun click() {
        println("Tombol $name berhasil di klik")
    }
}