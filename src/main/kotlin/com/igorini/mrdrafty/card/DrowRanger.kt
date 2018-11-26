package com.igorini.mrdrafty.card

/** Represents a card "Drow Ranger" */
class DrowRanger : Card() {
    override fun name() = "Drow Ranger"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 250.0
}