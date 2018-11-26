package com.igorini.mrdrafty.card

/** Represents a card "Raze" */
class Raze : Card() {
    override fun name() = "Raze"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 75.5
}