package com.igorini.mrdrafty.card

/** Represents a card "Keenfolk Plate" */
class KeenfolkPlate : Card() {
    override fun name() = "Keenfolk Plate"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 64.0
}