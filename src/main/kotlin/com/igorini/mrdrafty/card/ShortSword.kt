package com.igorini.mrdrafty.card

/** Represents a card "Short Sword" */
class ShortSword : Card() {
    override fun name() = "Short Sword"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.BASIC
    override fun baseScore() = 105.6
}