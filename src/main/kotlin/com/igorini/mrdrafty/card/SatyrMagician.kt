package com.igorini.mrdrafty.card

/** Represents a card "Satyr Magician" */
class SatyrMagician : Card() {
    override fun name() = "Satyr Magician"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 103.0
}