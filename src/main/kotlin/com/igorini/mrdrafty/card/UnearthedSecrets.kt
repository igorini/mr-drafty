package com.igorini.mrdrafty.card

/** Represents a card "Unearthed Secrets" */
class UnearthedSecrets : Card() {
    override fun name() = "Unearthed Secrets"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 146.0
}