package com.igorini.mrdrafty.card

/** Represents a card "Traveler's Cloak" */
class TravelersCloak : Card() {
    override fun name() = "Traveler's Cloak"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.BASIC
    override fun baseScore() = 106.8
}