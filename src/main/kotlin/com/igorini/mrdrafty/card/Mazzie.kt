package com.igorini.mrdrafty.card

/** Represents a card "Mazzie" */
class Mazzie : Card() {
    override fun name() = "Mazzie"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 93.6
}