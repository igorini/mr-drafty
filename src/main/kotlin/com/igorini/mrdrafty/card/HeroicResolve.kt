package com.igorini.mrdrafty.card

/** Represents a card "Heroic Resolve" */
class HeroicResolve : Card() {
    override fun name() = "Heroic Resolve"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 84.6
}