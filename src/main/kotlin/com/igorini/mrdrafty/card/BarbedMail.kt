package com.igorini.mrdrafty.card

/** Represents a card "Barbed Mail" */
class BarbedMail : Card() {
    override fun name() = "Barbed Mail"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 69.0
}