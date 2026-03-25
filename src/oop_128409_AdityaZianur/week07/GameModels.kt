package oop_128409_AdityaZianur.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(40),
    RARE(20),
    EPIC(5),
    LEGENDARY(1)
}

// Checkpoint 14: Data Class Item Game
data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)