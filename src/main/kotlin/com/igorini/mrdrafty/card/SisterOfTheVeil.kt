package com.igorini.mrdrafty.card

/** Represents a card "Sister of the Veil" */
class SisterOfTheVeil : Card() {
    override fun name() = "Sister of the Veil"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 108.1
}