package oop_128409_AdityaZianur.week06

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name dengan id:$id nyala")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name dengan id:$id mati")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV MULAI MEREKAM")
    }
}