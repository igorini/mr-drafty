package com.igorini.mrdrafty.card

/** Represents a card "Bitter Enemies" */
class BitterEnemies : Card() {
    override fun name() = "Bitter Enemies"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 76.0
}