package com.igorini.mrdrafty.card

/** Represents a card "New Orders" */
class NewOrders : Card() {
    override fun name() = "New Orders"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 91.3
}