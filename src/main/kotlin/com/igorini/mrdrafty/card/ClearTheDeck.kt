package com.igorini.mrdrafty.card

/** Represents a card "Clear The Deck" */
class ClearTheDeck : Card() {
    override fun name() = "Clear The Deck"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 99.8
}