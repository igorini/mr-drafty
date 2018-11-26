package com.igorini.mrdrafty.card

/** Represents a card "Sven" */
class Sven : Card() {
    override fun name() = "Sven"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 113.7
}