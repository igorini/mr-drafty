package com.igorini.mrdrafty.card

/** Represents a card "Cheating Death" */
class CheatingDeath : Card() {
    override fun name() = "Cheating Death"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 115.7
}