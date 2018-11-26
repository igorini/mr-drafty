package com.igorini.mrdrafty.card

/** Represents a card "Rising Anger" */
class RisingAnger : Card() {
    override fun name() = "Rising Anger"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 80.6
}