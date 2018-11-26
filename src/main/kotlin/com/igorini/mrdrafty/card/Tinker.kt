package com.igorini.mrdrafty.card

/** Represents a card "Tinker" */
class Tinker : Card() {
    override fun name() = "Tinker"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 230.0
}