package com.igorini.mrdrafty.card

/** Represents a card "Outworld Devourer" */
class OutworldDevourer : Card() {
    override fun name() = "Outworld Devourer"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 10.0
}