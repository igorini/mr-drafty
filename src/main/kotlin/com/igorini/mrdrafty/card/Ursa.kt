package com.igorini.mrdrafty.card

/** Represents a card "Ursa" */
class Ursa : Card() {
    override fun name() = "Ursa"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 98.6
}