package com.igorini.mrdrafty.card

/** Represents a card "Defend the Weak" */
class DefendTheWeak : Card() {
    override fun name() = "Defend the Weak"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 101.6
}