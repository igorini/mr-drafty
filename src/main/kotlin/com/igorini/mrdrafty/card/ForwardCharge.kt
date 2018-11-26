package com.igorini.mrdrafty.card

/** Represents a card "Forward Charge" */
class ForwardCharge : Card() {
    override fun name() = "Forward Charge"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 85.0
}