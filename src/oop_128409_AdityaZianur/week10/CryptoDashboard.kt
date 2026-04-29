package oop_128409_AdityaZianur.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.75))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO DASHBOARD ===")
    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Coin: ${coin.name} | Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 250.0))
    txRepo.add(Transaction("TX002", 1200.5))
    txRepo.add(Transaction("TX003", 75.25))

    val txResponse = ApiResponse("200 OK", txRepo.getAll())
    println("\n=== TRANSACTION HISTORY ===")
    println("Status: ${txResponse.status}")
    txResponse.data.forEach { tx ->
        println("Transaction ID: ${tx.id} | Amount: ${tx.amount}")
    }

    println("\n=== SEARCH TEST ===")
    val foundCoins = coinRepo.searchByName("BTC")
    foundCoins.forEach { println("Found: $it") }
}
