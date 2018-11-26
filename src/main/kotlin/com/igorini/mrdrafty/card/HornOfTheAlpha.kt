package com.igorini.mrdrafty.card

/** Represents a card "Horn of the Alpha" */
class HornOfTheAlpha : Card() {
    override fun name() = "Horn of the Alpha"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 100.3
}