package com.igorini.mrdrafty.card

/** Represents a card "Rolling Storm" */
class RollingStorm : Card() {
    override fun name() = "Rolling Storm"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 20.0
}