package com.igorini.mrdrafty.card

/** Represents a card "Sorla Khan" */
class SorlaKhan : Card() {
    override fun name() = "Sorla Khan"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 155.0
}