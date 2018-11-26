package com.igorini.mrdrafty.card

/** Represents a card "Fight Through the Pain" */
class FightThroughThePain : Card() {
    override fun name() = "Fight Through the Pain"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 77.4
}