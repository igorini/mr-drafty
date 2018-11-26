package com.igorini.mrdrafty.card

/** Represents a card "Legion Standard Bearer" */
class LegionStandardBearer : Card() {
    override fun name() = "Legion Standard Bearer"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 106.2
}