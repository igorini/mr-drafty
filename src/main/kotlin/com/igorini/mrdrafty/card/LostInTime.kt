package com.igorini.mrdrafty.card

/** Represents a card "Lost in Time" */
class LostInTime : Card() {
    override fun name() = "Lost in Time"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 99.7
}