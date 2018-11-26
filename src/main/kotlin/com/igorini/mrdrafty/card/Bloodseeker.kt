package com.igorini.mrdrafty.card

/** Represents a card "Bloodseeker" */
class Bloodseeker : Card() {
    override fun name() = "Bloodseeker"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 52.0
}