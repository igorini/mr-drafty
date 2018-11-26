package com.igorini.mrdrafty.card

/** Represents a card "Phantom Assassin" */
class PhantomAssassin : Card() {
    override fun name() = "Phantom Assassin"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 188.0
}