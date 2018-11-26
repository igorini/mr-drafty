package com.igorini.mrdrafty.card

/** Represents a card "Treant Protector" */
class TreantProtector : Card() {
    override fun name() = "Treant Protector"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 168.0
}