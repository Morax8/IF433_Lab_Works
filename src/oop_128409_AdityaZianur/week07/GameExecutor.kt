package oop_128409_AdityaZianur.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Awas! Muncul monster ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            val item = event.item
            println("Selamat! Kamu mendapatkan loot: ${item.name} [${item.rarity}] dengan damage ${item.damage}")
        }
        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu berada di zona aman. Silakan beristirahat.")
        }
    }
}