package oop_128409_AdityaZianur.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected"
        println("Dataabse is ready")
    }
}