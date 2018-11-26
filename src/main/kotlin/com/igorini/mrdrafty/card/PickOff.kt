package com.igorini.mrdrafty.card

/** Represents a card "Pick Off" */
class PickOff : Card() {
    override fun name() = "Pick Off"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 114.3
}