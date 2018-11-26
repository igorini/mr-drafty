package com.igorini.mrdrafty.card

/** Represents a card "Divine Purpose" */
class DivinePurpose : Card() {
    override fun name() = "Divine Purpose"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 74.4
}