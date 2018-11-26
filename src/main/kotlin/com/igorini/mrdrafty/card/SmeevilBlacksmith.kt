package com.igorini.mrdrafty.card

/** Represents a card "Smeevil Blacksmith" */
class SmeevilBlacksmith : Card() {
    override fun name() = "Smeevil Blacksmith"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 82.4
}