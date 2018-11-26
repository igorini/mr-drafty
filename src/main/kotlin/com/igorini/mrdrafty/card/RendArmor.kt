package com.igorini.mrdrafty.card

/** Represents a card "Rend Armor" */
class RendArmor : Card() {
    override fun name() = "Rend Armor"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 40.0
}