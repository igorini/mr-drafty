package com.igorini.mrdrafty.card

/** Represents a card "Ogre Conscript" */
class OgreConscript : Card() {
    override fun name() = "Ogre Conscript"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 113.2
}