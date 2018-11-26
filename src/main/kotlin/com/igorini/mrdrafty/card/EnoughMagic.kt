package com.igorini.mrdrafty.card

/** Represents a card "Enough Magic!" */
class EnoughMagic : Card() {
    override fun name() = "Enough Magic!"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 101.0
}