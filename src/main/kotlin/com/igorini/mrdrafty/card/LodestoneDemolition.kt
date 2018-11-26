package com.igorini.mrdrafty.card

/** Represents a card "Lodestone Demolition" */
class LodestoneDemolition : Card() {
    override fun name() = "Lodestone Demolition"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 42.0
}