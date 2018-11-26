package com.igorini.mrdrafty.card

/** Represents a card "Arcane Censure" */
class ArcaneCensure : Card() {
    override fun name() = "Arcane Censure"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 44.0
}