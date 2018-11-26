package com.igorini.mrdrafty.card

/** Represents a card "Lich" */
class Lich : Card() {
    override fun name() = "Lich"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 212.0
}