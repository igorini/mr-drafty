package com.igorini.mrdrafty.card

/** Represents a card "Oglodi Vandal" */
class OglodiVandal : Card() {
    override fun name() = "Oglodi Vandal"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 110.4
}