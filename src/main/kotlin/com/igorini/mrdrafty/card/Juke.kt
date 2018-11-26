package com.igorini.mrdrafty.card

/** Represents a card "Juke" */
class Juke : Card() {
    override fun name() = "Juke"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 87.6
}