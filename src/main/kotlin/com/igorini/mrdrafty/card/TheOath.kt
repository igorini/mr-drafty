package com.igorini.mrdrafty.card

/** Represents a card "The Oath" */
class TheOath : Card() {
    override fun name() = "The Oath"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 112.7
}