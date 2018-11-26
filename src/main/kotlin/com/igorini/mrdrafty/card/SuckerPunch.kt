package com.igorini.mrdrafty.card

/** Represents a card "Sucker Punch" */
class SuckerPunch : Card() {
    override fun name() = "Sucker Punch"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 96.5
}