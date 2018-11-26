package com.igorini.mrdrafty.card

/** Represents a card "Rebel Instigator" */
class RebelInstigator : Card() {
    override fun name() = "Rebel Instigator"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 96.6
}