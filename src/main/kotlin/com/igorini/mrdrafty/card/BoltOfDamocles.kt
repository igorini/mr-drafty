package com.igorini.mrdrafty.card

/** Represents a card "Bolt of Damocles" */
class BoltOfDamocles : Card() {
    override fun name() = "Bolt of Damocles"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 98.5
}