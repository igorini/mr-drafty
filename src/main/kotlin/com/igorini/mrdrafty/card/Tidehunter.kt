package com.igorini.mrdrafty.card

/** Represents a card "Tidehunter" */
class Tidehunter : Card() {
    override fun name() = "Tidehunter"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 68.6
}