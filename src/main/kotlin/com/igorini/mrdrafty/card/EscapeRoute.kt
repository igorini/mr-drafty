package com.igorini.mrdrafty.card

/** Represents a card "Escape Route" */
class EscapeRoute : Card() {
    override fun name() = "Escape Route"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 93.8
}