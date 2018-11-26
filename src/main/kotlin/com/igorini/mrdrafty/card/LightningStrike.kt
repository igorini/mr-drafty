package com.igorini.mrdrafty.card

/** Represents a card "Lightning Strike" */
class LightningStrike : Card() {
    override fun name() = "Lightning Strike"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 70.0
}