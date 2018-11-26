package com.igorini.mrdrafty.card

/** Represents a card "Bronze Legionnaire" */
class BronzeLegionnaire : Card() {
    override fun name() = "Bronze Legionnaire"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 116.7
}