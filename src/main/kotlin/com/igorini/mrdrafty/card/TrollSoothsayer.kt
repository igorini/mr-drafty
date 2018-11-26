package com.igorini.mrdrafty.card

/** Represents a card "Troll Soothsayer" */
class TrollSoothsayer : Card() {
    override fun name() = "Troll Soothsayer"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 106.6
}