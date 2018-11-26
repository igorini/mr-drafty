package com.igorini.mrdrafty.card

/** Represents a card "Assured Destruction" */
class AssuredDestruction : Card() {
    override fun name() = "Assured Destruction"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 90.9
}