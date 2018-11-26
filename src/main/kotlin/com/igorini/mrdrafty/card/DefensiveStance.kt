package com.igorini.mrdrafty.card

/** Represents a card "Defensive Stance" */
class DefensiveStance : Card() {
    override fun name() = "Defensive Stance"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 32.0
}