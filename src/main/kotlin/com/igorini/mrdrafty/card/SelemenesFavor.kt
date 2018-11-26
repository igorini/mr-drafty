package com.igorini.mrdrafty.card

/** Represents a card "Selemene's Favor" */
class SelemenesFavor : Card() {
    override fun name() = "Selemene's Favor"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 106.7
}