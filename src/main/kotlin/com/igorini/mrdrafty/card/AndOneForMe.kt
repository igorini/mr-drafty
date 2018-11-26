package com.igorini.mrdrafty.card

/** Represents a card "...And One For Me" */
class AndOneForMe : Card() {
    override fun name() = "...And One For Me"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 89.3
}