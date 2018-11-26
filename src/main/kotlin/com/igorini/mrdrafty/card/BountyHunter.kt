package com.igorini.mrdrafty.card

/** Represents a card "Bounty Hunter" */
class BountyHunter : Card() {
    override fun name() = "Bounty Hunter"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 123.0
}