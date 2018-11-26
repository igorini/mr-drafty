package com.igorini.mrdrafty.card

/** Represents a card "Pick a Fight" */
class PickAFight : Card() {
    override fun name() = "Pick a Fight"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 90.2
}