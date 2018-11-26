package com.igorini.mrdrafty.card

/** Represents a card "Howling Mind" */
class HowlingMind : Card() {
    override fun name() = "Howling Mind"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 76.6
}