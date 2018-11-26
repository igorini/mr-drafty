package com.igorini.mrdrafty.card

/** Represents a card "Claymore" */
class Claymore : Card() {
    override fun name() = "Claymore"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 66.7
}