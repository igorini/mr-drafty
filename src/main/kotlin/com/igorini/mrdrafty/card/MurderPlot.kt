package com.igorini.mrdrafty.card

/** Represents a card "Murder Plot" */
class MurderPlot : Card() {
    override fun name() = "Murder Plot"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 99.1
}