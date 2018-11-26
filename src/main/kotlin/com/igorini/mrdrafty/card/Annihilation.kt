package com.igorini.mrdrafty.card

/** Represents a card "Annihilation" */
class Annihilation : Card() {
    override fun name() = "Annihilation"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 135.0
}