package com.igorini.mrdrafty.card

/** Represents a card "Combat Training" */
class CombatTraining : Card() {
    override fun name() = "Combat Training"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 90.6
}