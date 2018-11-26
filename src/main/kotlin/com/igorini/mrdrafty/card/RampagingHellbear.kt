package com.igorini.mrdrafty.card

/** Represents a card "Rampaging Hellbear" */
class RampagingHellbear : Card() {
    override fun name() = "Rampaging Hellbear"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 102.2
}