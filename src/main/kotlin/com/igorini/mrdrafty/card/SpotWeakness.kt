package com.igorini.mrdrafty.card

/** Represents a card "Spot Weakness" */
class SpotWeakness : Card() {
    override fun name() = "Spot Weakness"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 91.2
}