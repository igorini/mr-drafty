package com.igorini.mrdrafty.card

/** Represents a card "Divine Intervention" */
class DivineIntervention : Card() {
    override fun name() = "Divine Intervention"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 111.8
}