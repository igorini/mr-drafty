package com.igorini.mrdrafty.card

/** Represents a card "Corrosive Mist" */
class CorrosiveMist : Card() {
    override fun name() = "Corrosive Mist"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 87.2
}