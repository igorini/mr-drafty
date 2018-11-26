package com.igorini.mrdrafty.card

/** Represents a card "Iron Fog Goldmine" */
class IronFogGoldmine : Card() {
    override fun name() = "Iron Fog Goldmine"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 112.5
}