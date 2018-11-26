package com.igorini.mrdrafty.card

/** Represents a card "Omniknight" */
class Omniknight : Card() {
    override fun name() = "Omniknight"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 194.0
}