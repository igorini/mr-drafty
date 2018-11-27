package com.igorini.mrdrafty.card

/** Represents a card "Golden Ticket" */
class GoldenTicket : Card() {
    override fun name() = "Golden Ticket"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 93.9
}