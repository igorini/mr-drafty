package com.igorini.mrdrafty.card

/** Represents a card "Sniper" */
class Sniper : Card() {
    override fun name() = "Sniper"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 166.0
}