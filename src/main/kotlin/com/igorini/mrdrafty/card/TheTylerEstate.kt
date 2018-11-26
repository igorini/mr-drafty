package com.igorini.mrdrafty.card

/** Represents a card "The Tyler Estate" */
class TheTylerEstate : Card() {
    override fun name() = "The Tyler Estate"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 77.8
}