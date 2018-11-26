package com.igorini.mrdrafty.card

/** Represents a card "Intimidation" */
class Intimidation : Card() {
    override fun name() = "Intimidation"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 105.0
}