package oop_128409_AdityaZianur.week04

class Pasta: Makanan() {
    private var topping: String = ""
    public fun pasta_terjual(jml: Int){
        this.topping = "nori"
        super.harga = jml * 120
        println("pasta $topping laris $harga")
    }

    override public fun jual_makanan(){
        println("jual makanan pasta enak")
    }
}