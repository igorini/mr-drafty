package com.igorini.mrdrafty.card

/** Represents a card "Payday" */
class Payday : Card() {
    override fun name() = "Payday"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 104.0
}