package oop_128409_AdityaZianur.week05

abstract class MataKuliah {
    var nama:String = ""

    abstract fun set_matkul(sks: Int)
}


fun main(){
//    val wjib = Wajib()
//    wjib.set_matkul(3)
//
//    val elc = Elective()
//    elc.set_matkul(3)

    val listMatkul: List<MataKuliah> = listOf(
        Wajib(),
        Elective()
    );
    println("Banyak tipe matkul: $listMatkul")

    for (mku in listMatkul) {
        if (mku is Wajib){
            mku.ada_seminar()
        } else if (mku is Elective){
            mku.ada_praktek()
        }

        when(mku) {
            is Elective -> {
                println("Elective dari when:  ")
                mku.ada_praktek()
            }
            is Wajib -> {
                println("Wajib dari when:  ")
                mku.ada_seminar()
            }
        }
    }

}