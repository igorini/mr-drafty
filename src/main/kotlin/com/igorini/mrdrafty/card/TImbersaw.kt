package com.igorini.mrdrafty.card

/** Represents a card "Timbersaw" */
class Timbersaw : Card() {
    override fun name() = "Timbersaw"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 81.6
}