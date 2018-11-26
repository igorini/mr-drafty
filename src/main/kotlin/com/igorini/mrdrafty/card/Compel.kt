package com.igorini.mrdrafty.card

/** Represents a card "Compel" */
class Compel : Card() {
    override fun name() = "Compel"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 102.3
}