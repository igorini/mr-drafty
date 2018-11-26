package com.igorini.mrdrafty.card

/** Represents a card "Stonehall Elite" */
class StonehallElite : Card() {
    override fun name() = "Stonehall Elite"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 130.0
}