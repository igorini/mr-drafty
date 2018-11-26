package com.igorini.mrdrafty.card

/** Represents a card "Buying Time" */
class BuyingTime : Card() {
    override fun name() = "Buying Time"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 83.3
}