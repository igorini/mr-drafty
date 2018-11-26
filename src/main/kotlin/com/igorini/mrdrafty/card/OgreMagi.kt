package com.igorini.mrdrafty.card

/** Represents a card "Ogre Magi" */
class OgreMagi : Card() {
    override fun name() = "Ogre Magi"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 120.0
}