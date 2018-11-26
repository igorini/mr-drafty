package com.igorini.mrdrafty.card

/** Represents a card "Ventriloquy" */
class Ventriloquy : Card() {
    override fun name() = "Ventriloquy"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 93.0
}