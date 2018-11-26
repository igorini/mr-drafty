package com.igorini.mrdrafty.card

/** Represents a card "The Cover of Night" */
class TheCoverOfNight : Card() {
    override fun name() = "The Cover of Night"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 90.3
}