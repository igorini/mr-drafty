package com.igorini.mrdrafty.card

/** Represents a card "Storm Spirit" */
class StormSpirit : Card() {
    override fun name() = "Storm Spirit"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 56.0
}