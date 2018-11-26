package com.igorini.mrdrafty.card

/** Represents a card "Soul of Spring" */
class SoulOfSpring : Card() {
    override fun name() = "Soul of Spring"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 117.0
}