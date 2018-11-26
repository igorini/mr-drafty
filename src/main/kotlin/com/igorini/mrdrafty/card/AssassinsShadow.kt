package com.igorini.mrdrafty.card

/** Represents a card "Assassin's Shadow" */
class AssassinsShadow : Card() {
    override fun name() = "Assassin's Shadow"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 101.4
}