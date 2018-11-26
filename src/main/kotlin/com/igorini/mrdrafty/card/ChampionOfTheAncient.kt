package com.igorini.mrdrafty.card

/** Represents a card "Champion of the Ancient" */
class ChampionOfTheAncient : Card() {
    override fun name() = "Champion of the Ancient"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 104.5
}