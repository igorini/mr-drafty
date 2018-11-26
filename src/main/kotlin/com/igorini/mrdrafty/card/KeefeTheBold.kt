package com.igorini.mrdrafty.card

/** Represents a card "Keefe the Bold" */
class KeefeTheBold : Card() {
    override fun name() = "Keefe the Bold"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.BASIC
    override fun baseScore() = 92.0
}