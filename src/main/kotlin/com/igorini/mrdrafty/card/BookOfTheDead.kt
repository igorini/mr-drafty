package com.igorini.mrdrafty.card

/** Represents a card "Book of the Dead" */
class BookOfTheDead : Card() {
    override fun name() = "Book of the Dead"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 82.6
}