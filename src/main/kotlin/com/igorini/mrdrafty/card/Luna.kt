package com.igorini.mrdrafty.card

/** Represents a card "Luna" */
class Luna : Card() {
    override fun name() = "Luna"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 198.0
}