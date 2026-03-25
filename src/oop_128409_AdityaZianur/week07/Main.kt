package oop_128409_AdityaZianur.week07

fun main(){
    println("===Test Singleton===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== test companion obj===")
    val client = NetworkClient.createClient()
    client.connect()
}