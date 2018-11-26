package com.igorini.mrdrafty.card

/** Represents a card "Grazing Shot" */
class GrazingShot : Card() {
    override fun name() = "Grazing Shot"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 91.9
}