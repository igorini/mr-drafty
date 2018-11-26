package com.igorini.mrdrafty.card

/** Represents a card "Glyph of Confusion" */
class GlyphOfConfusion : Card() {
    override fun name() = "Glyph of Confusion"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 71.0
}