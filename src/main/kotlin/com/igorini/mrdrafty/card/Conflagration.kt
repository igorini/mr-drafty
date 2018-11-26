package com.igorini.mrdrafty.card

/** Represents a card "Conflagration" */
class Conflagration : Card() {
    override fun name() = "Conflagration"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 122.0
}