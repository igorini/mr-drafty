package com.igorini.mrdrafty.card

/** Represents a card "Venomancer" */
class Venomancer : Card() {
    override fun name() = "Venomancer"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 106.5
}