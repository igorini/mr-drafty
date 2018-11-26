package com.igorini.mrdrafty.card

/** Represents a card "Ogre Corpse Tosser" */
class OgreCorpseTosser : Card() {
    override fun name() = "Ogre Corpse Tosser"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 96.3
}