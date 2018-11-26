package com.igorini.mrdrafty.card

/** Represents a card "Crippling Blow" */
class CripplingBlow : Card() {
    override fun name() = "Crippling Blow"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 72.2
}