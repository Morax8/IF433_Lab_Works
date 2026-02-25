package oop_128409_AdityaZianur.week04

class Sushi: Makanan() {
    private var jenis: String = ""
    public fun sushi_terjual(jns:String, jml: Int){
        this.jenis = jns
        super.harga = jml * 100
        println("sushi $jenis laku $harga")
    }

}