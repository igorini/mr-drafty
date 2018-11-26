package com.igorini.mrdrafty.card

/** Represents a card "Shield of Basilius" */
class ShieldOfBasilius : Card() {
    override fun name() = "Shield of Basilius"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 95.7
}