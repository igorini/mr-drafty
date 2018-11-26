package com.igorini.mrdrafty.card

/** Represents a card "Crystal Maiden" */
class CrystalMaiden : Card() {
    override fun name() = "Crystal Maiden"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 50.0
}