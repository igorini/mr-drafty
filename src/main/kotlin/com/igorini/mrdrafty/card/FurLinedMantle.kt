package com.igorini.mrdrafty.card

/** Represents a card "Fur-lined Mantle" */
class FurLinedMantle : Card() {
    override fun name() = "Fur-lined Mantle"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 77.0
}