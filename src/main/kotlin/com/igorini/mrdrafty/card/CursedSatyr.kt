package com.igorini.mrdrafty.card

/** Represents a card "Cursed Satyr" */
class CursedSatyr : Card() {
    override fun name() = "Cursed Satyr"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 88.6
}