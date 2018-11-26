package com.igorini.mrdrafty.card

/** Represents a card "Shop Deed" */
class ShopDeed : Card() {
    override fun name() = "Shop Deed"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 57.0
}