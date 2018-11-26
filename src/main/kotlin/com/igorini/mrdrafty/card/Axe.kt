package com.igorini.mrdrafty.card

/** Represents a card "Axe" */
class Axe : Card() {
    override fun name() = "Axe"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 235.0
}