package com.igorini.mrdrafty.card

/** Represents a card "Debbi the Cunning" */
class DebbiTheCunning : Card() {
    override fun name() = "Debbi the Cunning"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.BASIC
    override fun baseScore() = 90.0
}