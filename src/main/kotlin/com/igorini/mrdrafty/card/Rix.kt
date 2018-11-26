package com.igorini.mrdrafty.card

/** Represents a card "Rix" */
class Rix : Card() {
    override fun name() = "Rix"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 30.0
}