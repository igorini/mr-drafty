package com.igorini.mrdrafty.card

/** Represents a card "Hero's Cape" */
class HerosCape : Card() {
    override fun name() = "Hero's Cape"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 74.2
}