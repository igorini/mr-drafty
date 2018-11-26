package com.igorini.mrdrafty.card

/** Represents a card "Collateral Damage" */
class CollateralDamage : Card() {
    override fun name() = "Collateral Damage"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 81.8
}