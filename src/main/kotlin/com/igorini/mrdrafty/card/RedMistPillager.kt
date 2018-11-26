package com.igorini.mrdrafty.card

/** Represents a card "Red Mist Pillager" */
class RedMistPillager : Card() {
    override fun name() = "Red Mist Pillager"
    override fun imageUrl() = ""
    override fun color() = CardColor.RED
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 113.0
}