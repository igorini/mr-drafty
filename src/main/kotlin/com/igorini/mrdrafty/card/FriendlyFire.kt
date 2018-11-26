package com.igorini.mrdrafty.card

/** Represents a card "Friendly Fire" */
class FriendlyFire : Card() {
    override fun name() = "Friendly Fire"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 107.8
}