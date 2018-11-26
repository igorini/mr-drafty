package com.igorini.mrdrafty.card

/** Represents a card "Stonehall Plate" */
class StonehallPlate : Card() {
    override fun name() = "Stonehall Plate"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 90.7
}