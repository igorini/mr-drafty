package com.igorini.mrdrafty.card

/** Represents a card "Temple of War" */
class TempleOfWar : Card() {
    override fun name() = "Temple of War"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 72.6
}