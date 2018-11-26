package com.igorini.mrdrafty.card

/** Represents a card "Mercenary Exiles" */
class MercenaryExiles : Card() {
    override fun name() = "Mercenary Exiles"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 109.5
}