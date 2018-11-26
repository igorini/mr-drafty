package com.igorini.mrdrafty.card

/** Represents a card "Routed" */
class Routed : Card() {
    override fun name() = "Routed"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 88.4
}