package com.igorini.mrdrafty.card

/** Represents a card "At Any Cost" */
class AtAnyCost : Card() {
    override fun name() = "At Any Cost"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 112.2
}