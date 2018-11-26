package com.igorini.mrdrafty.card

/** Represents a card "Gank" */
class Gank : Card() {
    override fun name() = "Gank"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 113.5
}