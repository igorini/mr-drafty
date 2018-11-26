package com.igorini.mrdrafty.card

/** Represents a card "Smash Their Defenses!" */
class SmashTheirDefenses : Card() {
    override fun name() = "Smash Their Defenses!"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 99.6
}