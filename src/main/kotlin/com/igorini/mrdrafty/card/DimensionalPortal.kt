package com.igorini.mrdrafty.card

/** Represents a card "Dimensional Portal" */
class DimensionalPortal : Card() {
    override fun name() = "Dimensional Portal"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 127.0
}