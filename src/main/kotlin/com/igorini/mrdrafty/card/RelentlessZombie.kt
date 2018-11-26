package com.igorini.mrdrafty.card

/** Represents a card "Relentless Zombie" */
class RelentlessZombie : Card() {
    override fun name() = "Relentless Zombie"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 91.6
}