package com.igorini.mrdrafty.card

/** Represents a card "Pugna" */
class Pugna : Card() {
    override fun name() = "Pugna"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 66.0
}