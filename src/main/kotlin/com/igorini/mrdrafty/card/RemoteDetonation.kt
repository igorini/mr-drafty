package com.igorini.mrdrafty.card

/** Represents a card "Remote Detonation" */
class RemoteDetonation : Card() {
    override fun name() = "Remote Detonation"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 95.3
}