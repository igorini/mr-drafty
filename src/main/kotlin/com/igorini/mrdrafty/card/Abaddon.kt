package com.igorini.mrdrafty.card

/** Represents a card "Abaddon" */
class Abaddon : Card() {
    override fun name() = "Abaddon"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 84.5
}