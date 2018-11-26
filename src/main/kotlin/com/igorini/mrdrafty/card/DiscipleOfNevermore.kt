package com.igorini.mrdrafty.card

/** Represents a card "Disciple of Nevermore" */
class DiscipleOfNevermore : Card() {
    override fun name() = "Disciple of Nevermore"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 118.0
}