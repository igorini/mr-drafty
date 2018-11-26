package com.igorini.mrdrafty.card

/** Represents a card "Meepo" */
class Meepo : Card() {
    override fun name() = "Meepo"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 54.0
}