package com.igorini.mrdrafty.card

/** Represents a card "Lycan" */
class Lycan : Card() {
    override fun name() = "Lycan"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 186.0
}