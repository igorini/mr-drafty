package com.igorini.mrdrafty.card

/** Represents a card "Ring of Tarrasque" */
class RingOfTarrasque : Card() {
    override fun name() = "Ring of Tarrasque"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 83.0
}