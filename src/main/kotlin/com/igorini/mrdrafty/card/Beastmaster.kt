package com.igorini.mrdrafty.card

/** Represents a card "Beastmaster" */
class Beastmaster : Card() {
    override fun name() = "Beastmaster"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 111.6
}