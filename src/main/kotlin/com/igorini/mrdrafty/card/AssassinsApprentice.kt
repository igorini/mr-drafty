package com.igorini.mrdrafty.card

/** Represents a card "Assassin's Apprentice" */
class AssassinsApprentice : Card() {
    override fun name() = "Assassin's Apprentice"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 107.9
}