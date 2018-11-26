package com.igorini.mrdrafty.card

/** Represents a card "Curse of Atrophy" */
class CurseOfAtrophy : Card() {
    override fun name() = "Curse of Atrophy"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 89.0
}