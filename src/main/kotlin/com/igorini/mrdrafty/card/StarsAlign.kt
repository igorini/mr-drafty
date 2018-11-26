package com.igorini.mrdrafty.card

/** Represents a card "Stars Align" */
class StarsAlign : Card() {
    override fun name() = "Stars Align"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 97.8
}