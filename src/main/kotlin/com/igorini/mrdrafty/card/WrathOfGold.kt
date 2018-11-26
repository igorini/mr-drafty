package com.igorini.mrdrafty.card

/** Represents a card "Wrath of Gold" */
class WrathOfGold : Card() {
    override fun name() = "Wrath of Gold"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 41.0
}