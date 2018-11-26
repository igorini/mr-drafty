package com.igorini.mrdrafty.card

/** Represents a card "Untested Grunt" */
class UntestedGrunt : Card() {
    override fun name() = "Untested Grunt"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 100.1
}