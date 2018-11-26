package com.igorini.mrdrafty.card

/** Represents a card "Earthshaker" */
class Earthshaker : Card() {
    override fun name() = "Earthshaker"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 100.7
}