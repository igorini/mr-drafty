package com.igorini.mrdrafty.card

/** Represents a card "J'Muy the Wise" */
class JmuyTheWise : Card() {
    override fun name() = "J'Muy the Wise"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.BASIC
    override fun baseScore() = 86.0
}