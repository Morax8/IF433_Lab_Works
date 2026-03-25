package oop_128409_AdityaZianur.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Dull Sword", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            // Karena diminta damage tinggi untuk tipe EPIC
            val epicItem = GameItem("KingSword", 99, ItemRarity.EPIC)
            return Weapon(epicItem, 150)
        }
    }
}