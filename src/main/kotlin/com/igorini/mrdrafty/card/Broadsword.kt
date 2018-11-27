package com.igorini.mrdrafty.card

/** Represents a card "Broadsword" */
class Broadsword : Card() {
    override fun name() = "Broadsword"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 80.7
}