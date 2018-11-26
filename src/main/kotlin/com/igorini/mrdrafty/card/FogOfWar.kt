package com.igorini.mrdrafty.card

/** Represents a card "Fog of War" */
class FogOfWar : Card() {
    override fun name() = "Fog of War"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 78.0
}