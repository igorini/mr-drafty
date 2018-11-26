package com.igorini.mrdrafty.card

/** Represents a card "Emissary of the Quorum" */
class EmissaryOfTheQuorum : Card() {
    override fun name() = "Emissary of the Quorum"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.CREEP
    override fun rarity() = CardRarity.RARE
    override fun baseScore() = 180.0
}