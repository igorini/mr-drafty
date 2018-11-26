package com.igorini.mrdrafty.card

/** Represents a card "Prellex" */
class Prellex : Card() {
    override fun name() = "Prellex"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 107.2
}