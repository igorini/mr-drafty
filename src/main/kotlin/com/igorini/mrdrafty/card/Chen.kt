package com.igorini.mrdrafty.card

/** Represents a card "Chen" */
class Chen : Card() {
    override fun name() = "Chen"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 117.8
}