package com.igorini.mrdrafty.card

/** Represents a card "Selfish Cleric" */
class SelfishCleric : Card() {
    override fun name() = "Selfish Cleric"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 110.2
}