package com.igorini.mrdrafty.card

/** Represents a card "Legion Commander" */
class LegionCommander : Card() {
    override fun name() = "Legion Commander"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 192.0
}