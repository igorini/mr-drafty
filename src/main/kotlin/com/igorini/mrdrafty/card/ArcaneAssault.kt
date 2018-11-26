package com.igorini.mrdrafty.card

/** Represents a card "Arcane Assault" */
class ArcaneAssault : Card() {
    override fun name() = "Arcane Assault"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 96.9
}