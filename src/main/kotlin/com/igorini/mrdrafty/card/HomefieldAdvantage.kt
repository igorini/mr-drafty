package com.igorini.mrdrafty.card

/** Represents a card "Homefield Advantage" */
class HomefieldAdvantage : Card() {
    override fun name() = "Homefield Advantage"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 107.4
}