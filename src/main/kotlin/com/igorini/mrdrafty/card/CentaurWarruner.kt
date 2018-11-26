package com.igorini.mrdrafty.card

/** Represents a card "Centaur Warruner" */
class CentaurWarruner : Card() {
    override fun name() = "Centaur Warruner"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 88.8
}