package com.igorini.mrdrafty.card

/** Represents a card "Chainmail" */
class Chainmail : Card() {
    override fun name() = "Chainmail"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 66.0
}