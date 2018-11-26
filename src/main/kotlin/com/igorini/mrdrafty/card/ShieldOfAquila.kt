package com.igorini.mrdrafty.card

/** Represents a card "Shield of Aquila" */
class ShieldOfAquila : Card() {
    override fun name() = "Shield of Aquila"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 98.0
}