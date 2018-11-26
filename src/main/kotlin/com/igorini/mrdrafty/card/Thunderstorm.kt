package com.igorini.mrdrafty.card

/** Represents a card "Thunderstorm" */
class Thunderstorm : Card() {
    override fun name() = "Thunderstorm"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 106.5
}