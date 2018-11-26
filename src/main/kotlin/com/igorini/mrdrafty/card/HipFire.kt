package com.igorini.mrdrafty.card

/** Represents a card "Hip Fire" */
class HipFire : Card() {
    override fun name() = "Hip Fire"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 109.2
}