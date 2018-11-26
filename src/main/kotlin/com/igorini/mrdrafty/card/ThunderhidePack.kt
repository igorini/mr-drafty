package com.igorini.mrdrafty.card

/** Represents a card "Thunderhide Pack" */
class ThunderhidePack : Card() {
    override fun name() = "Thunderhide Pack"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 121.0
}