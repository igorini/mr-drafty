package com.igorini.mrdrafty.card

/** Represents a card "Time of Triumph" */
class TimeOfTriumph : Card() {
    override fun name() = "Time of Triumph"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 185.0
}