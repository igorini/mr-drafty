package com.igorini.mrdrafty.card

/** Represents a card "Grand Melee" */
class GrandMelee : Card() {
    override fun name() = "Grand Melee"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 83.6
}