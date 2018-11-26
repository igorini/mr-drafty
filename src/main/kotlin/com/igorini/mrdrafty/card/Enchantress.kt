package com.igorini.mrdrafty.card

/** Represents a card "Enchantress" */
class Enchantress : Card() {
    override fun name() = "Enchantress"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 140.0
}