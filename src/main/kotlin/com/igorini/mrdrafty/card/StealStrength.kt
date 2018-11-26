package com.igorini.mrdrafty.card

/** Represents a card "Steal Strength" */
class StealStrength : Card() {
    override fun name() = "Steal Strength"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 108.0
}