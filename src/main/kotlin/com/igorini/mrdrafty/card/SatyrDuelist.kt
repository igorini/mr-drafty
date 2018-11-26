package com.igorini.mrdrafty.card

/** Represents a card "Satyr Duelist" */
class SatyrDuelist : Card() {
    override fun name() = "Satyr Duelist"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 113.3
}