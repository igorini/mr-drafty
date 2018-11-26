package com.igorini.mrdrafty.card

/** Represents a card "Dark Seer" */
class DarkSeer : Card() {
    override fun name() = "Dark Seer"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 92.6
}