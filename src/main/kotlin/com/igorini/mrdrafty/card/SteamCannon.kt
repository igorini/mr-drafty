package com.igorini.mrdrafty.card

/** Represents a card "Steam Cannon" */
class SteamCannon : Card() {
    override fun name() = "Steam Cannon"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.IMPROVEMENT
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 113.6
}