package com.igorini.mrdrafty.card

/** Represents a card "Burning Oil" */
class BurningOil : Card() {
    override fun name() = "Burning Oil"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 100.4
}