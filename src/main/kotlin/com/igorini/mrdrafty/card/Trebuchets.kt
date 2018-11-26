package com.igorini.mrdrafty.card

/** Represents a card "Trebuchets" */
class Trebuchets : Card() {
    override fun name() = "Trebuchets"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 87.0
}