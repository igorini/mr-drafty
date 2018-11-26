package com.igorini.mrdrafty.card

/** Represents a card "Assassin's Veil" */
class AssassinsVeil : Card() {
    override fun name() = "Assassin's Veil"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 95.1
}