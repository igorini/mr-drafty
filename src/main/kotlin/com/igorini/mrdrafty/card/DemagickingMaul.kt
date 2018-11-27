package com.igorini.mrdrafty.card

/** Represents a card "Demagicking Maul" */
class DemagickingMaul : Card() {
    override fun name() = "Demagicking Maul"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 97.5
}