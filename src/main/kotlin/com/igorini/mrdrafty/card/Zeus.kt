package com.igorini.mrdrafty.card

/** Represents a card "Zeus" */
class Zeus : Card() {
    override fun name() = "Zeus"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 119.0
}