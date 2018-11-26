package com.igorini.mrdrafty.card

/** Represents a card "Bellow" */
class Bellow : Card() {
    override fun name() = "Bellow"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 85.6
}