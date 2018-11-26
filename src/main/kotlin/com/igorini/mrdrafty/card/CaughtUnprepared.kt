package com.igorini.mrdrafty.card

/** Represents a card "Caught Unprepared" */
class CaughtUnprepared : Card() {
    override fun name() = "Caught Unprepared"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 86.8
}