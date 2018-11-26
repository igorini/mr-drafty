package com.igorini.mrdrafty.card

/** Represents a card "Slay" */
class Slay : Card() {
    override fun name() = "Slay"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 109.3
}