package com.igorini.mrdrafty.card

/** Represents a card "Leather Armor" */
class LeatherArmor : Card() {
    override fun name() = "Leather Armor"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.BASIC
    override fun baseScore() = 89.5
}