package com.igorini.mrdrafty.card

/** Represents a card "Tower Barrage" */
class TowerBarrage : Card() {
    override fun name() = "Tower Barrage"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 96.8
}