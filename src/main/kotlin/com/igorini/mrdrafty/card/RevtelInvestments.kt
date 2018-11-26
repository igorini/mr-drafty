package com.igorini.mrdrafty.card

/** Represents a card "Revtel Investments" */
class RevtelInvestments : Card() {
    override fun name() = "Revtel Investments"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 91.5
}