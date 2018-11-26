package com.igorini.mrdrafty.card

/** Represents a card "Bristleback" */
class Bristleback : Card() {
    override fun name() = "Bristleback"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 125.0
}