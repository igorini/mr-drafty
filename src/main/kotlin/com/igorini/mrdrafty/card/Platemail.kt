package com.igorini.mrdrafty.card

/** Represents a card "Platemail" */
class Platemail : Card() {
    override fun name() = "Platemail"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 62.0
}