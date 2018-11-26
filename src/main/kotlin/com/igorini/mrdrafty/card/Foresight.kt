package com.igorini.mrdrafty.card

/** Represents a card "Foresight" */
class Foresight : Card() {
    override fun name() = "Foresight"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 105.7
}