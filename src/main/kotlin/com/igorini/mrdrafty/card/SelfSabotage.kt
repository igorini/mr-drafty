package com.igorini.mrdrafty.card

/** Represents a card "Self Sabotage" */
class SelfSabotage : Card() {
    override fun name() = "Self Sabotage"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 31.0
}