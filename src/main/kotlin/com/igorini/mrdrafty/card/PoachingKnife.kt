package com.igorini.mrdrafty.card

/** Represents a card "Poaching Knife" */
class PoachingKnife : Card() {
    override fun name() = "Poaching Knife"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 82.9
}