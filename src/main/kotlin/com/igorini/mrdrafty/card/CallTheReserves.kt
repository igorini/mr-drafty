package com.igorini.mrdrafty.card

/** Represents a card "Call the Reserves" */
class CallTheReserves : Card() {
    override fun name() = "Call the Reserves"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 87.5
}