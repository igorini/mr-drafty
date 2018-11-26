package com.igorini.mrdrafty.card

/** Represents a card "Poised to Strike" */
class PoisedToStrike : Card() {
    override fun name() = "Poised to Strike"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 84.2
}