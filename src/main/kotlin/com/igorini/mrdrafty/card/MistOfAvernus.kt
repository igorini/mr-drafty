package com.igorini.mrdrafty.card

/** Represents a card "Mist of Avernus" */
class MistOfAvernus : Card() {
    override fun name() = "Mist of Avernus"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 172.0
}