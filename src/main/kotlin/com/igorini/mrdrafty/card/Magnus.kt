package com.igorini.mrdrafty.card

/** Represents a card "Magnus" */
class Magnus : Card() {
    override fun name() = "Magnus"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 96.7
}