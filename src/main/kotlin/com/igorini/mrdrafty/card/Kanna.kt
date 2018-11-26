package com.igorini.mrdrafty.card

/** Represents a card "Kanna" */
class Kanna : Card() {
    override fun name() = "Kanna"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 150.0
}