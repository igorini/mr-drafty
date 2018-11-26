package com.igorini.mrdrafty.card

/** Represents a card "Cunning Plan" */
class CunningPlan : Card() {
    override fun name() = "Cunning Plan"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 107.1
}