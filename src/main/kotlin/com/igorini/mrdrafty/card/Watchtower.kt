package com.igorini.mrdrafty.card

/** Represents a card "Watchtower" */
class Watchtower : Card() {
    override fun name() = "Watchtower"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 29.0
}