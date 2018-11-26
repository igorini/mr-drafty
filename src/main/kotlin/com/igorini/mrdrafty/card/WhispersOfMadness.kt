package com.igorini.mrdrafty.card

/** Represents a card "Whispers of Madness" */
class WhispersOfMadness : Card() {
    override fun name() = "Whispers of Madness"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 36.0
}