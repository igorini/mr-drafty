package com.igorini.mrdrafty.card

/** Represents a card "Rebel Decoy" */
class RebelDecoy : Card() {
    override fun name() = "Rebel Decoy"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 105.5
}