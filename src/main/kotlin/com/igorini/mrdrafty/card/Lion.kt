package com.igorini.mrdrafty.card

/** Represents a card "Lion" */
class Lion : Card() {
    override fun name() = "Lion"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 56.0
}